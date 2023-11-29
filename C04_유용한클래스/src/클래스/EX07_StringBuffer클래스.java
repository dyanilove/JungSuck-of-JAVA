package 클래스;

public class EX07_StringBuffer클래스 {

	public static void main(String[] args) {
//		StringBuffer클래스
//		: String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
//		: 그러나, String과 달리 내용을 변경할 수 있다.(mutable)
		StringBuffer sb = new StringBuffer("abc");
		sb.append("123");
		System.out.println(sb);
		
//		StringBuffer는 eqauls()가 오버라이딩 되어있지 않다(주소비교)
//		그래서 String으로 변환 후에 equals()로 비교해야한다.
	}

}
