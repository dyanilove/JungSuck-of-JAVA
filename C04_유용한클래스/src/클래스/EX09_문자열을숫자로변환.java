package 클래스;

import java.util.ArrayList;

public class EX09_문자열을숫자로변환 {
	public static void main(String[] args) {
//		문자열을 숫자로 변환하는 다양한 방법
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");		// 주로 이 방법 사용
		
//		n진법의 문자열을 숫자로 변환하는 방법
		int i3 = Integer.parseInt("100",2);
		int i4 = Integer.parseInt("100",8);
		int i5 = Integer.parseInt("100",16);
		int i6 = Integer.parseInt("FF",16);
		System.out.println(i6);
		
//		==================================================
//		오토박싱 & 언박싱
//			: 기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대는 언박싱
		int k = 5;
		Integer iObj = new Integer(7);
		int sum = i + iObj.intValue(); 	//기본형으로 변환
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);	// 오토박싱. 10 -> new Integer(10)
		int value = list.get(0);	// 언박싱. new Integer(10) -> 10
		
	}
}
