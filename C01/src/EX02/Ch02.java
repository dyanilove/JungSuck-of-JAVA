package EX02;

public class Ch02 {

	public static void main(String[] args) {
//		형변환
//		형변환이란? 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
//		(타입)피연산자 -> 형변환
		double d = 85.4;
		int score = (int)d;
		System.out.println(score);
		
//		산술변환
//			 : 연산 전에 피연산자의 타입을 일치시키는 것
//		산술변환의 규칙
//		① 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치(∵값 손실을 줄이기위해))
		int a = 1000000;
		int b = 2000000;
//		long c = a*b;
		long c = (long)a*b;
		System.out.println(c);
		
//		② 피연산자의 타입이 int보다 작은 타입이면, int로 변환한다.
//		ex) byte + short -> int + int -> int
//		ex) char + short -> int + int -> int
		
//		---------------------------------------------------------------
		
//		조건 연산자
//				: 조건식의 결과에 따라 연산결과를 달리함
//		result = (x > y) ? x : y	(괄호 생략가능)
//		-> (x > y)가 참이면 x, 거짓이면 y
		
//		대입 연산자
//				: 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
		
	}
}
