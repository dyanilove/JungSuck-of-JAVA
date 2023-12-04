package 람다;

public class EX02_함수형인터페이스 {
	public static void main(String[] args) {
//		◆ 함수형 인터페이스	
//			: 단 하나의 추상메서드만 선언된 인터페이스
		
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) {	// 오버라이딩 - 접근제어자 좁게 못바꿈.
//				return a> b? a:b;
//			}
//		};
		
		// 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f = (a,b)-> a > b ? a : b;	// 람다식. 익명객체
		
		
		int value = f.max(3, 5);	// 함수형 인터페이스
		System.out.println("value = "+ value);
	}

}

@FunctionalInterface	// 함수형 인터페이스는 단 하나의 추상메서드만
interface MyFunction2{
//	public abstract int max(int a, int b);
	int max(int a, int b);	// 윗줄과 동일
}
