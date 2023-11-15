package EX01;

public class Ch03 {
	public static void main(String[] args) {
		String str ="3";
		
//	타입간의 변환방법
//	1. 문자와 숫자간의 변화
//		ex) (숫자)3을 문자로 -> 3 + '0'
//			(문자)'3'을 숫자로 -> '3' - '0'
		System.out.println('3'-'0'-1);
		System.out.println(3+'0');	//'0'은 숫자로 48
		System.out.println((char)(3+'0'));
		
//	2. 문자열로의 변환
//		빈문자열 "" 더해주기
		
//	3. 문자열을 숫자로 변환
//		Integer.parseInt("3") 함수 활용
		System.out.println(Integer.parseInt(str)+5);
		
	}
	
	
}
