package C01예외처리;

public class EX05_예외선언하기 {
	public static void main(String[] args) {
//		예외 처리하는 방법 : try-catch문, 예외 선언하기
//		메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것.
//		※예외를 발생시키는 키워드 throw, 예외를 메서드에 선언하는 키워드 throws 구별!
		
//		finally블럭
//			: 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.
		
//		예외 되던지기
//			: 예외를 처리한 후에 다시 예외를 발생시키는 것.
//			: 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것.
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외처리 되었습니다.");
		}
		
	}
	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외 처리 되었습니다.");
			throw e;	// 다시 예외를 발생시킨다.
		}
	}

}
