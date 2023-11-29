package 클래스;

public class EX06_문자열과기본형변환 {
	public static void main(String[] args) {
//		숫자를 문자열로 바꾸는 방법
		int i = 100;
		String str1 = i + "";				// 100을 "100"으로 변환하는 방법 1(편리함)
		String str2 = String.valueOf(i);	// 100을 "100"으로 변환하는 방법 2(속도빠름)
		
//		문자열을 숫자로 바꾸는 방법
		int k = Integer.parseInt("100");	// "100"을 100으로 변환하는 방법 1
		int k2 = Integer.valueOf("100");	// "100"을 100으로 변환하는 방법 2
		Integer k3 = Integer.valueOf("100");// 원래 반환하는 타입이 Integer
	}

}
