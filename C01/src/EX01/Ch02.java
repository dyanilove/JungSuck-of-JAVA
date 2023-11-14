package EX01;

public class Ch02 {

	public static void main(String[] args) {
		// ******printf()*****
		
		// println()의 단점 : 출력형식 지정불가 
		// ① 실수의 자리수 조절 불가
		// ex) 소수점 n자리만 출력하고 싶은데 안됨..
		System.out.println(10/3.0);
		// 출력 결과 : 3.333333333...
		// ② 10진수로만 출력된다.
		
		// printf()로는 출력형식 지정가능하다.
		System.out.printf("%.2f%n",10.0/3);	// 3.33
		System.out.printf("%d%n", 0x1A);		// 26
		System.out.printf("%x%n",0x1A);		// 1a
		

	}

}
