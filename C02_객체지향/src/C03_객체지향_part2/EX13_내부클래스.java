package C03_객체지향_part2;

class A{	// 외부 클래스
	
	int i = 100;
	B b = new B();
	
	class B{	// 내부 클래스
		void method() {
			System.out.println(i);	// 객체 생성없이 외부클래스의 멤버 접근가능
		}
	}
}
public class EX13_내부클래스 {

//	내부 클래스
//		: 클래스 안의 클래스 
//	내부 클래스의 장점 : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
//				  : 코드의 복잡성을 줄일 수 있다.(캡슐화)
	
//	내부 클래스의 종류와 특징
//		: 내부 클래스의 종류와 유효범위는 변수와 동일
//	- 1. 인스턴스 내부 클래스(≒iv)
//		: 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 인스턴스멤버처럼 다루어진다.
//		: 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
//	- 2. 스태틱 내부 클래스(≒cv)
//		: 외부 클래스의 멤버변수 선언위치에 선언하며, 외부 클래스의 static멤버처럼 다루어진다.
//		: 주로 외부 클래스의 static멤버, 특히 static메서드에서 사용될 목적으로 선언된다.
//	- 3. 지역 내부 클래스(≒lv)
//		: 외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다.
//	- 4. 익명 내부 클래스
//		: 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)
	
	class InstanceInner{	// 인스턴스 클래스
		int iv = 200;
//		static int cv = 100;	// 에러! static변수를 선언할 수 없다.
		final static int CONST = 100;	// final static은 상수이므로 허용
	}
	static class StaticInner{	// 스태틱 클래스
		int iv = 200;
		static int cv = 100;	// static클래스만 static멤버 쓸 수 있다.
	}
	void myMethod() {
		class LocalInner{	// 지역 클래스
			int iv =300;
//			static int cv = 200;	// 에러! static변수를 선언할 수 없다.
			final static int CONST = 300;	// final static은 상수이므로 허용
		}
		int i = LocalInner.CONST;
		System.out.println(i);
	}
	public static void main(String[] args) {
		A a = new A();
		a.b.method();
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST);	// 에러.. 지역클래스는 그 메서드 안에서만 쓸 수 있기 때문	
		EX13_내부클래스 ss = new EX13_내부클래스();
		ss.myMethod();
	}
}
