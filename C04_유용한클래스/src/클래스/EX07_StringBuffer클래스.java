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
		
//		=============================================
		//StringBuffer의 생성자
		
//		- StringBuffer() : 빈 문자열을 가진 StringBuffer를 생성
		StringBuffer emptyBuffer = new StringBuffer();
        System.out.println("Empty StringBuffer: " + emptyBuffer);
        
//		- StringBuffer(String str) : 주어진 문자열로 초기화된 StringBuffer를 생성
        String initialString = "Hello, Java!";
        StringBuffer stringBuffer = new StringBuffer(initialString);
        System.out.println("StringBuffer with Initial String: " + stringBuffer);
        
        
        //StringBuffer의 메서드
        
//        - append(String str) : 문자열을 현재 StringBuffer에 덧붙인다.
        stringBuffer.append(", Java!");
        System.out.println("After append: " + stringBuffer);
        
//        - insert(int offset, String str) : 주어진 오프셋에 문자열을 삽입
        stringBuffer.insert(6, "GPT-3 ");
        System.out.println("After insert: " + stringBuffer);

//        - delete(int start, int end) : 주어진 범위의 문자를 삭제
        stringBuffer.delete(5, 9);
        System.out.println("After delete: " + stringBuffer);
        
//        - reverse() : 문자열을 뒤집는다.
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
		
	}

}
