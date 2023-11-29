package 클래스;

public class EX05_String생성자 {
	public static void main(String[] args) {
		// String클래스의 생성자들
		
		// String(char[] chars)	: 주어진 문자 배열로 문자열을 생성
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String helloString = new String(charArray);
		System.out.println(helloString);
		
		// String(String original) : 다른 문자열과 동일한 내용의 문자열을 생성
		String originalString = "Hello";
		String copiedString = new String(originalString);
		
		// String클래스의 메서드들
		
		// length() : 문자열의 길이를 반환
		String str = "Hello, World!";
		int length = str.length();
		System.out.println(length);
		
		// charAt(int index) : 주어진 인덱스에 있는 문자를 반환
		char firstChar = str.charAt(0);
		System.out.println(firstChar);
		
		// substring(int beginIndex) / substring(int beginIndex, int endIndex) : 부분 문자열을 반환
		String sub1 = str.substring(7); // "World!"
		String sub2 = str.substring(0, 5); // "Hello"
		System.out.println(sub1+"+"+sub2);
		
		//concat(String str) / + 연산자 : 문자열을 결합
		String name = "John";
		String greeting = "Hello, " + name + "!";
		// 또는
		String greeting2 = "Hello, ".concat(name).concat("!");

		//equals(Object anObject) / equalsIgnoreCase(String anotherString) : 문자열이 주어진 문자열과 같은지 확인
		String str1 = "Hello";
		String str2 = "hello";
		boolean isEqual = str1.equals(str2); // false
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true

		//toUpperCase() / toLowerCase(): 대소문자 변환을 수행
		String lowercase = str.toLowerCase();
		String uppercase = str.toUpperCase();

		// indexOf(String str) / lastIndexOf(String str): 주어진 문자열이 처음/마지막으로 나타나는 위치의 인덱스를 반환
		int indexOfWorld = str.indexOf("World"); // 7
		int lastIndexOfl = str.lastIndexOf("l"); // 10


	}

}
