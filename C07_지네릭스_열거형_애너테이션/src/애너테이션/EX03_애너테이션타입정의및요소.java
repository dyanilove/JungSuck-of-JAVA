package 애너테이션;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class EX03_애너테이션타입정의및요소 {

//	애너테이션을 직접 만들어서 쓸 수 있다.
	//	@interface 애너테이션 이름{
	//		타입 요소이름();	//애너테이션의 요소를 선언
	//		}
//	애너테이션의 메서드는 추상메서드이며, 애너테이션을 적용할 때 지정(순서x)
//	적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정가능(null제외)
//	요소가 하나이고 이름이 value일때는 요소의 이름 생략 가능
//	요소의 타입이 배열일 경우, 괄호{}를 사용해야한다.
	
//	애너테이션 요소의 규칙
//		1. 요소의 타입은 기본형, String, enum, 애너테이션, class만 허용됨.
//		2. 괄호()안에 매개변수를 선언할 수 없다.
//		3. 예외를 선언할 수 없다.
//		4. 요소를 타입 배개변수로 정의할 수 없다.

	public static void main(String[] args) {
		// Ex12_8의 Class객체를 얻는다.
		Class<EX03_애너테이션타입정의및요소> cls = EX03_애너테이션타입정의및요소.class;

		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();

		// Ex12_8에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	}
	
}
@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
@interface TestInfo {
	int       count()	  	default 1;
	String    testedBy();
	String[]  testTools() 	default "JUnit";
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
