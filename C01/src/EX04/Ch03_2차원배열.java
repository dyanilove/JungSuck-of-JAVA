package EX04;

public class Ch03_2차원배열 {

	public static void main(String[] args) {
//		2차원 배열
//		: 테이블 형태의 데이터를 저장하기 위한 배열
		
//		2차원 배열 초기화
		int [][] arr = {
							{1,2,3},
							{4,5,6}
						};
		
//		2차원 배열 예제
		int [][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum =0;
		
		for(int i=0;i<score.length;i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
				sum += score[i][j];
			}
		}
		System.out.println("sum = "+sum);

	}	

}
