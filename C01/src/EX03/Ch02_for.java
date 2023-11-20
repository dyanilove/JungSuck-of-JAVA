package EX03;

public class Ch02_for {
	public static void main(String[] args) {
//		for문
//		: 조건을 만족하는 동안 블럭{}을 반복 - 반복횟수를 알 때 적합
		
		for(int i =0;i<10;i=i+2) {
			System.out.println("hello");
		}
		int sum =0;
		for(int i=0;i<5;i++) {
			sum += i;
			System.out.println(i);
		}
		
//		중첩 for문
//				: for문 내에 또 다른 for문을 포함시킬 수 있다.
//		구구단 출력해보기
		for(int i=2; i<10;i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i +" * "+j+" = "+ (i*j));
			}
			System.out.println();
		}
		
//		별 찍기 세로5 가로 10
		for(int i=0; i<5;i++) {
			for(int j=0; j<10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		별찍기 순차적으로 1 ->2->3 이렇게 5줄까지
		for(int i=0; i<5;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
