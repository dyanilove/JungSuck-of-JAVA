package EX04;

import java.util.Arrays;

public class Ch01_배열 {
	public static void main(String[] args) {
//		배열이란?
//		: 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.

//		배열의 선언과 생성
//		배열의 선언 : 배열을 다루기 위한 참조변수의 선언
		
//		int[] score;			//1. 배열 score을 선언(참조변수)
//		score = new int[5];		//2. 배열의 생성(int저장공간 x 5)
		
		int[] score = new int[5]; 	// 배열의 선언과 생성을 동시에
		score[3] = 100;
		
//		-------------------------------------------------
//		배열의 길이
//		배열이름.length : 배열의 길이(int형 상수)
		int[] arr = new int[5];
		int tmp = arr.length;
		System.out.println(tmp);
//		※배열은 한번 생성하면 그 길이를 바꿀 수 없음※
		
		for(int i =0; i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
//		--------------------------------------------------
//		배열의 초기화
//		: 배열의 각 요소에 처음으로 값을 저장하는 것
		arr[1] = 10;	//초기화
//		더 간단하게 초기화하는 방법
		int[] arry = new int[] {50,60,70,80,90};
		int[] array = {10,20,30,70};	//99%이렇게 초기화함..
		
		for(int i=0; i<arry.length;i++) {
			System.out.println("arry["+i+"] = "+arry[i]);
		}
		for(int i=0; i<array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		
//		배열 출력
//		기본으로 for문 사용, 더 간단히 할라면, Arrays.toString함수사용
		System.out.println(Arrays.toString(arry));
	}
}
