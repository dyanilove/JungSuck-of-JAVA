package CollectionFrameWork;

import java.util.Arrays;
import java.util.Comparator;

public class EX07_Comparator_Comparable {
	public static void main(String[] args) {
//		객체를 정렬하는데 필요한 메서드를 정의한 인터페이스
//		 ▶ Comparable : 기본 정렬기준을 구현하는데 사용
//		 ▶ Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
		Integer[] arr = { 30, 50, 10, 40, 20 }; 

		Arrays.sort(arr); // Integer가 가지고 있는 기본 정렬기준 compareTo()로 정렬 
		System.out.println(Arrays.toString(arr));

		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp()); // DescComp에 구현된 정렬 기준으로 정렬
		System.out.println(Arrays.toString(arr));
	}

}
class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1; // Integer가 아니면, 비교하지 않고 -1 반환

		Integer i  = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		// return i2 - i; 또는 return i2.compareTo(i);도 가능
		return i.compareTo(i2) * -1; // 기본 정렬인 compareTo()의 역순으로 정렬
	}
}