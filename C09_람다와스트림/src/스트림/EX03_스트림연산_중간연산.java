package 스트림;

import java.util.stream.IntStream;

public class EX03_스트림연산_중간연산 {
	public static void main(String[] args) {
//		스트림 중간연산
//		 ▶ 스트림 자르기 - skip(),limit()
//			Stream<T> skip(long n)	// 앞에서 n개 건너뛰기
//			Stream<T> limit(long maxSize)	// maxSize이후의 요소는 잘라냄
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(System.out::print);
		
		System.out.println();
		
//		 ▶ 스트림의 요소 걸러내기 - filter(), distinct()
//			Stream<T> filter(Predicate<? super T> Predicate)	// 조건에 맞지않는 요소 제거
//			Stream<T> distinct()								// 중복 제거
		IntStream intStream1 = IntStream.of(1,2,2,3,3,3,4,4,5,6,7,7,8,8);
		intStream1.distinct().forEach(System.out::print);
		
		System.out.println();
		
		IntStream intStream3 = IntStream.rangeClosed(1, 10);
		intStream3.filter(i->i%2==0).forEach(System.out::print);
		
//		 ▶ 스트림 정렬하기 - sorted()
		
	}
}
