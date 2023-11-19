package EX03;

import java.util.Scanner;

public class Ch01 {
	public static void main(String[] args) {
//		switch문
//		: 처리해야 하는 경우의 수가 많을 때 유용한 조건문
		
//		switch문의 제약조건
//		1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
//		2. case문의 값은 정수 상수(문자포함), 문자열만 가능하며, 중복되지 않아야 한다. (변수 안됨..)
		
		System.out.println("현재 월을 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
		}
		
//		임의의 정수 만들기
//		Math.random() - 0.0과 1.0사이의 임의의 double값을 반환
//		ex)
		int num = 0;
		for(int i = 1; i<=6; i++) {
			num = (int)(Math.random()*45)+1;
			System.out.println(num);
		}
//		quize) -5~5사이의 난수를 20개 출력하시오
		num =0;
		for(int j=0; j<=20; j++) {
			num = (int)(Math.random()*11)-5;
			System.out.println(num);
		}
		
	}
}
