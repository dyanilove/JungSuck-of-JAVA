package EX04;

public class Ch04_String클래스 {

	public static void main(String[] args) {
//		String클래스
//		1. String 클래스는 char[]와 메서드(기능)를 결합한 것
//		String클래스 = char[] + 메서드(기능)
		
//		2. String 클래스는 내용을 변경할 수 없다(read only)
		

		String string ="ABCDE";
		char ch = string.charAt(4);
		System.out.println(ch);
		
		String str2 = string.substring(1,4);
		System.out.println(str2);
		
	}

}
