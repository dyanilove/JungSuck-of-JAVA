package 클래스;

public class EX04_String클래스 {
	
//	String클래스 = 데이터(char[]) + 메서드(문자열 관련)
//		: 내용을 변경할 수 없는 불변(immutable)클래스
//		: 그래서 덧셈 연산자를 이용한 문자열 결합은 성능이 떨어짐.
//		: 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용
	public static void main(String[] args) {
		
		// 문자열의 비교
//		 - String str = "abc";와 String str = new String("abc");의 비교
		String str1 = "abc";	// 문자열 리터럴 "abc"의 주소가 str1에 저장됨, 주소값 공유
		String str2 = "abc";	// 문자열 리터럴 "abc"의 주소가 str2에 저장됨, 주소값 공유
		String str3 = new String("abc");	// 새로운 String인스턴스를 생성, 항상 새로운 문자열 만들어짐
		String str4 = new String("abc");	// 새로운 String인스턴스를 생성, 항상 새로운 문자열 만들어짐
		
		if(str1 == str2) {
			System.out.println(true);	// true
		}else {
			System.out.println(false);
		}
		if(str3 == str4) {
			System.out.println(true);
		}else {
			System.out.println(false);	//false
		}
		
//		문자열 리터럴
//			: 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
//			: 같은 내용의 문자열 리터럴은 하나만 만들어진다.
		
//		빈 문자열
//			: 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
	}

}
