package C01예외처리;

public class EX02_try_catch문 {
	
	public static void main(String[] args) {
		
		try {
			/* 예외가 발생할 가능성이 있는 문장들을 넣는다. */
		} catch (Exception e) {
			// Exception이 발생했을 경우, 이를 처리하기 위한 문장들을 적는다.
		}
		
//		try-catch문의 흐름
//		① try블럭 내에서 예외가 발생한 경우
//			1. 발생한 예외와 일치하는 catch블럭이 있는지 확인
//			2. 일치하는 catch블럭을 찾게 되면, 그 catch블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 
//			   그 다음 문장을 계속해서 수행한다. 만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 않는다.
//		② try블럭 내에서 예외가 발생하지 않은 경우
//			1. catch블럭을 거치치 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.
		
//		예시 1
//		System.out.println(1);
//		try {
//			System.out.println(2);
//			System.out.println(3);
//		} catch (Exception e) {
//			System.out.println(4);
//		}	// try-catch문 끝
//		System.out.println(5);
//		예시 1 끝
		
//		예시 2
		System.out.println(1);
		try {
			System.out.println(0/0);	// 예외 발생!
			System.out.println(2);		// 출력 되지 않음. 위에서 예외발생해서
		} catch (ArithmeticException e) {
			System.out.println(3);
		}	// try-catch문 끝
		System.out.println(4);
		
		
	}

}
