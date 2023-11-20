package EX03;

import java.util.Scanner;

public class Ch04_break {

	public static void main(String[] args) {
		//break문
//		: 자신이 포함된 하나의 반복문을 벗어난다.
		
//		1부터 증가하는 수를 더해서 총 합에 100이 넘으면 stop하고 그 수 랑 합 보기
		int i =0, sum =0;
		
		while(true) {//무한 반복문
			if(sum>100)
				break;
			++i;
			sum += i;
		}
		System.out.println(i);
		System.out.println(sum);
		System.out.println("-----------");
		
//		=================================
//		continue문
//		: 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
//		  전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
		for(int j =0; j<10; j++) {
			if(j%3==0)
				continue;
			System.out.println(j);
		}
		
//		continue 예시
		int menu = 0, num=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 파스타");
			System.out.println("2. 치킨");
			System.out.println("3. 떡볶이");
			System.out.println("4. 삼겹살");
			System.out.print("원하는 메뉴(1~4) 선택하시오(0-종료)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(1<= menu && menu <=4)) {
				System.out.println("메뉴 잘못선택(종료 -0");
				continue;
			}
			System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");
		}
		
		
		

	}

}
