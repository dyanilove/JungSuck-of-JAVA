package EX03;

import java.util.Scanner;

public class Ch03_while {

	public static void main(String[] args) {
//		while문
//		: 조건을 만족시키는 동안 블럭{}을 반복 -반복 횟수를 모를 때(반복문의 원조)
		
		int i=5;
		while(i--!=0) {
			System.out.println(i +" 취뽀~!");
		}
		
		int sum =0; i=0;
		while(sum <=100) {
			System.out.printf("%d - %d%n",i,sum);
			sum += ++i;
		}
//		각자리 합 구하기
		int num =0; sum =0;
		System.out.println("숫자 입력하세요");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("각 자리의 합 : "+sum);
		
//		=====================================================
		
//		do-while문
//		: 블럭{}을 최소한 한 번 이상 반복 - 사용자 입력받을 때 유용
//		do{ 조건식의 연산결과가 참일 때 수행될 문장 적음(처음 한번은 무조건 실행)}
//		while(조건식);
		
//		난수를 만들어서 사용자가 그 난수 맞추게 하기
		int input =0, answer =0;
		answer = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하시오>");
			input = scan.nextInt();
			if(input>answer) {
				System.out.println("더 작은 수 시도해보세요.");
			}else if(input<answer) {
				System.out.println("더 큰 수 시도해보세요");
			}
		}while(input != answer);
		System.out.println("정답입니다.");
	}

}
