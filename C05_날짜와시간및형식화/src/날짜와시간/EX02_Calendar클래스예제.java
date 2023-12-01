package 날짜와시간;

import java.util.Calendar;

public class EX02_Calendar클래스예제 {
	public static void main(String[] args) {
//		- set()으로 날짜와 시간 정하기
//			void set(int field, int value)
//			void set(int year, int month, int date)
//			void set(int year, int month, int date, int hourOfDay, int minute)
//			void set(int year, int month, int date, int hourOfDay, int minute, int second)
		
//		- 날짜 지정하는 방법, 월(Month)이 0부터 시작한다는 점 주의
		Calendar date1 = Calendar.getInstance();
		date1.set(2023, 11,01);	//2023.12.01

		
//		- 시간 지정하는 방법
		Calendar time1 = Calendar.getInstance();
		time1.set(17, 40,00);
		
//		- clear()는 Calendar객체의 모든 필드를 초기화(다른필드에 영향 O)
		
//		- add()는 특정 필드의 값을 증가 또는 감소
		Calendar date = Calendar.getInstance();
		date.clear();	// 모든 필드 초기화.
		date.set(2023, 11, 01);
		System.out.println(toString(date));
		
		date.add(Calendar.DATE,-2);
		date.add(Calendar.MONTH, 5);
		System.out.println(toString(date));
		
//		- roll()은 특정필드의 값을 증가 또는 감소(다른필드에 영향 X)
		date.clear();
		date.set(2023, 11, 01);
		System.out.println(toString(date));
		//add와 달리 다른 필드에 영향을 미치지 않는다.
		date.roll(Calendar.DATE, -2);
		date.roll(Calendar.MONTH, 5);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "
				+date.get(Calendar.DATE)+"일";
	}
}
