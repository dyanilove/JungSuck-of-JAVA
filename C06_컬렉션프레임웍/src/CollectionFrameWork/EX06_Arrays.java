package CollectionFrameWork;

import java.util.Arrays;
import java.util.List;

public class EX06_Arrays {
	public static void main(String[] args) {
//		Arrays - 배열을 다루기 편리한 메서드 제공
//		1. 배열의 출력 - toString()
//		2. 배열의 복사 - copyOf(), copyOfRange()
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		
//		3. 배열 채우기 - fill(), setAll()
		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
//		4. 배열의 정렬과 검색 - sort(), binarySearch()
		int[] arr8 = {3,2,1,0,4};
		int idx = Arrays.binarySearch(arr8, 2);	// idx = -5 -> 잘못된 결과
//		binarySearch()는 정렬된 배열에만 사용가능
		Arrays.sort(arr8);
		System.out.println(Arrays.toString(arr8));
		int idx2 = Arrays.binarySearch(arr8, 2);
		System.out.println(idx2);
		
//		5. 다차원 배열의 출력 - deepToString()
		int[][] arr2D = {{11,12},{21,22}};
		System.out.println(Arrays.deepToString(arr2D));
		
//		6. 다차원 배열의 비교 - deepEquals()
		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));     // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		
//		7. 배열을 List로 반환 - asList(Object...a)
		List list = Arrays.asList(new Integer[] {1,2,3,4,5});
		List list1 = Arrays.asList(1,2,3,4,5);
//		list.add(6);	// list는 읽기 전용이므로 예외발생
		
		
	}
}
