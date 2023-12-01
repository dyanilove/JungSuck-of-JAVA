package 형식화;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX01_형식화클래스 {
	public static void main(String[] args) {
//		형식화클래스
//			- java.text패키지의 DecimalFormat,SimpleDateFormat
//			- 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자,날짜 -> 형식 문자열)

		//	- DecimalFormat
		double number = 1234567.89;
		DecimalFormat df = new DecimalFormat("#.#E0");
		String result = df.format(number);
		System.out.println(result);
		
//			- 형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식문자열 -> 숫자, 날짜)
		DecimalFormat df1  = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		try {
			Number num = df1.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> ");

			double d = num.doubleValue(); 
			System.out.print(d + " -> ");

			System.out.println(df2.format(num));
		} catch(Exception e) {}
		
//			- SimpleDateFormat
//				: 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(today);
		System.out.println(date);
		
//				: 특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
		DateFormat dd = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat dd1 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d = dd.parse("2023년 12월 01일");
			System.out.println(dd1.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
