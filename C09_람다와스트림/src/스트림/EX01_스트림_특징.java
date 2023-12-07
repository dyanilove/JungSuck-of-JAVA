package 스트림;

import java.util.stream.Stream;

public class EX01_스트림_특징 {
	public static void main(String[] args) {
//		스트림(Stream)
//			: 다양한 데이터소스를 표준화된 방법으로 다루기 위한 것
		
//		스트림이 제공하는 기능 - 중간연산과 최종연산
//			▶ 중간 연산 : 연산결과가 스트림 연산. 반복적으로 적용가능
//			▶ 최종 연산 : 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)
		
		String[] strArr = {"dd","aaa","CC","cc","b"};
		Stream<String> stream = Stream.of(strArr);	// 문자열 배열이 소스인 스트림(스트림만들기)
		Stream<String> filteredStream = stream.filter(null);	// 걸러내기(중간 연산)
		Stream<String> distinctedStream = stream.distinct();	// 중복제거(중간 연산)
		Stream<String> sortedStream = stream.sorted();			// 정렬(중간 연산)
		Stream<String> limitedStream = stream.limit(5);			// 스트림 자르기(중간 연산)
		int total = (int) stream.count();	// 요소 개수 세기(최종연산)
		
//		----------------------------------------------------------------------------
		
//		스트림의 특징
//		 ▶ 스트림은 데이터 소스로부터 데이터를 읽기만 할 뿐 변경하지 않는다.
//		 ▶ 스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야 함)
//		 ▶ 최종 연산 전까지 중간 연산이 수행되지 않는다.(지연된 연산)	
//		 ▶ 스트림은 작업을 내부 반복으로 처리한다.
//		 ▶ 스트림의 작업을 병렬로 처리 - 병렬스트림
		
		
	}
}
