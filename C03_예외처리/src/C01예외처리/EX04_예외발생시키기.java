package C01예외처리;

public class EX04_예외발생시키기 {

//	예외 발생시키기
//	1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
//		Exception e = new Exception("고의로 발생시킴");
//	2. 키워드 throw를 이용해서 예외를 발생시킨다.
//		throw e;

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			// throw new Exception("고의로 발생시킴");
		} catch (Exception e) {
			System.out.println("에러메시지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}
}
