package 날짜와시간;

import java.util.Calendar;

public class EX01_Calendar클래스 {
	public static void main(String[] args) {

//		java.util.Date
//			: 날짜와 시간을 다룰 목적으로 만들어진 클래스
//			: Date의 메서드는 거의 deprecated되었지만, 여전히 쓰이고 있음.
		
//		java.util.Calendar
//			: Date클래스를 개선한 새로운 클래스. 여전히 단점은 존재
		
//		java.time패키지
//			: Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공
		
//		Calendar클래스
//			: 추상 클래스이므로 getInstace()를 통해 구현된 객체를 얻어야 한다.
//		Calendar cal = new Calendar();	// 에러! 추상클래스는 인스턴스를 생성할 수 없음.
		Calendar cal = Calendar.getInstance();	// 현재 날짜와 시간이 세팅
		System.out.println(cal);
//			get()으로 날짜와 시간 필드 가져오기 - int get(int field)
		int thisYear = cal.get(Calendar.YEAR);	// 올해가 몇년도인지
		System.out.println(thisYear);	
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);	// 이달의 마지막 날
		System.out.println(lastDayOfMonth);
	}

}
