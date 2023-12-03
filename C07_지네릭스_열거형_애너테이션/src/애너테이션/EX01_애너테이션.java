package 애너테이션;

class Parent {
	void parentMethod() { }
}
class Child extends Parent {
	@Override
//	void parentmethod() { } // 조상 메서드의 이름을 잘못 적었음. 
	void parentMethod() {}
}

@FunctionalInterface
interface Testable{ // 함수형 인터페이스는 하나의 추상메서드만 가져야 함.
	void test();
//	void check();
}

public class EX01_애너테이션 {
	public static void main(String[] args) {
//		애너테이션이란?
//			: 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
		
//		표준애너테이션
//		- @Override
//			: 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
//			: 오버라이딩 할 때 메서드 이름을 잘못 적을 경우가 많다.
//			: 오버라이딩 할 때는 메서드 선언부 앞에 @Override를 붙이자!
		
//		- @Deprecated
//			: 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
//			: @Deprecated의 사용 예, Date클래스의 getDate()
//			: @Deprecated가 붙은 대상이 사용된 코드를 컴파일하면 경고 메세지 나타남
		
//		- @FunctionallInterface
//			: 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
//			: 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음.
	}

}
