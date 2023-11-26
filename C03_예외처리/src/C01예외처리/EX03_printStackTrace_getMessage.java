package C01예외처리;

public class EX03_printStackTrace_getMessage {
	
//	printStackTrace()
//		: 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
//	getMessage()
//		: 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생! 예외 발생하면, 예외객체가 만들어짐. 그안에 printStackTrace(),getMessage()있음
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);
	}
}
