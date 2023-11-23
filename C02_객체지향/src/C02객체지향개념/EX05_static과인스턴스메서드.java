package C02객체지향개념;

class MyMath2{
	long a,b;
	
	long add() {	//	인스턴스 메서드
		return a+b;
	}
	
	static long add(long a, long b) {	// 클래스 메서드(static메서드)
		return a+b;
	}
}

class TestClass{
//	static메서드는 인스턴스 메서드를 호출할 수 없다.
	void instanceMethod() {}		// 인스턴스 메서드
	static void staticMethod() {}	// 클래스 메서드
	
	void instanceMethod2() {		//인스턴스 메서드
		instanceMethod();			// 인스턴스메서드 호출 가능
		staticMethod();				// 클래스 메서드 호출 가능
	}
	static void staticMethod2() {	// 클래스 메서드
//		instanceMethod();			// 에러~!~! 인스턴스 메서드 호출 불가
		staticMethod();
	}
}
class TestClass2{
//	static메서드는 인스턴스 변수 사용할 수 없다.
	
	int iv;			// 인스턴스 변수
	static int cv;	// 클래스 변수(언제든지 호출 가능)
	
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {
//		System.out.println(iv);	//에러!! 인스턴스 변수 사용 불가..
		System.out.println(cv);
	}
}

public class EX05_static과인스턴스메서드 {
	
//	인스턴스 메서드 :
//		- 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
//		- 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
//		- 메서드 내에서 인스턴스 변수(iv) 사용가능
	
//	static 메서드(클래스메서드)
//		: 객체생성 없이 '클래스이름.메서드이름()'으로 호출
//		: 인스턴스 멤버(iv,im)와 관련없는 작업을 하는 메서드
//		: 메서드 내에서 인스턴스 변수(iv) 사용불가
	
//	static을 언제 붙여야 할까?
//	: 속성(멤버변수) 중에서 공통 속성에 static을 붙인다.
//	: 인스턴스멤버(iv,im)을 사용하지 않는 메서드에 static을 붙인다.
	
//	question. static메서드는 왜 인스턴스 멤버 쓸 수 없는가?
//	Answer. static메서드 호출시 객체(iv묶음)가 없을 수도 있어서

}
