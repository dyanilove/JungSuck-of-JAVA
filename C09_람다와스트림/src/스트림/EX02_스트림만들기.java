package 스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EX02_스트림만들기 {
	public static void main(String[] args) {
//		스트림 만들기 - 컬렉션
//		 ▶ Collection인터페이스의 stream()으로 컬렉션을 스트림으로 반환
//			Stream<E> stream()	//Collection인터페이스의 메서드
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();	// list를 Stream으로 변환(Stream생성..)
		intStream.forEach(System.out::print);	//forEach()는 최종연산
		
		// Stream은 1회용. Stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream = list.stream();	// list로부터 stream생성
		intStream.forEach(System.out::println);
		
		
//		스트림 만들기 - 배열
//			Stream<T> stream.of(T...values);	// 가변인자
//			Stream<T> stream.of(T[])
//			Stream<T> Arrays.stream(T[])
//			Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(System.out::println);
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c","d"});
		strStream2.forEach(System.out::print);
		System.out.println();
		Stream<String> strStream3 = Arrays.stream(new String[] {"a","b","c","d"});
		strStream3.forEach(System.out::print);
		
		
//		스트림 만들기 - 임의의 수
//			난수를 요소로 갖는 스트림 생성하기
		IntStream intStream1 = new Random().ints();	//무한 스트림
		intStream1.limit(5).forEach(System.out::println);
		
//		스트림 만들기 - 특정 범위의 정수
//			IntStream IntStream.range(int begin, int end)
//			IntStream IntStream.rangeClosed(int begin, int end) //끝번호까지
		
	}
}
