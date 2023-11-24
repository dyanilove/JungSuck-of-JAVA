package C03_객체지향_part2;

public class EX06_제어자 {
	
//	제어자
//		: 클래스와 클래스 멤버(멤버변수, 메서드)에 부가적인 의미 부여

//		- 접근 제어자	: public, protected, (default), private
//		- 그		외	: static, final, abstract, native, transient, synchronized, volatile, strictfp
	
//	 	: 하나의 대상에 여러 제어자를 같이 사용 가능(접근제어자는 하나만..)
	public static final int width =200;
	
//	static - 클래스의, 공통적인
//		: 멤버변수 혹은 메서드앞에서 사용
	
//	final	-	마지막의, 변경될 수 없는
//		+ 클래스 : 변경될 수 없는 클래스, 확장될 수 없는 클래스가 됨. final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
//		+ 메서드 : 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
//		+ 멤버변수&지역변수 : 값을 변경할 수 없는 상수 됨.
	
//	abstract - 추상의, 미완성의
//		+ 클래스 : 클래스 내에 추상 메서드가 선언되어 있음을 의미	 	(추상클래스의 인스턴스 생성불가..)
//		+ 메서드 : 선언부만 작성하고, 구현부는 작성하지 않은 추상 메서드임을 알림.
	abstract class AbstractTest{	// 추상 클래스(추상 메서드를 포함한 클래스)
		abstract void move();		// 추상 메서드(구현부가 없는 메서드)
	}

//	접근제어자
//	- private	: 같은 클래스 내에서만 접근 가능
//	- (default)	: 같은 패키지 내에서만 접근 가능
//	- protected	: 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근 가능
//	- public	: 접근 제한이 전혀 없음
}
