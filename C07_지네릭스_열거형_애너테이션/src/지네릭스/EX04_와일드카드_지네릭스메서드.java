package 지네릭스;

import java.util.ArrayList;

public class EX04_와일드카드_지네릭스메서드 {
	public static void main(String[] args) {
//		와일드카드 <?>
//			: 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능하게 함.
//		와일드 카드의 종류 3가지
//			<? extends T>	: 와일드 카드의 상한 제한. T와 그 자손들만 가능
//			<? super T>		: 와일드 카드의 하한 제한. T와 그 조상들만 가능
//			<?>				: 제한 없음. 모든 타입이 가능. <? extends Object>와 동일
		ArrayList<? extends Product> list  = new ArrayList<Tv>();	// 와일드 카드로 대입된 타입 달라도 OK.
		
//		========================================
//		지네릭 메서드
//			: 지네릭 타입이 선언된 메서드(타입변수는 메서드 내에서만 유효)
//			: 클래스의 타입 매개변수<T>와 메서드 타입 매개변수 <T>는 별개
//			: 메서드를 호출할 때마다 타입을 대입해야한다.(대부분 생략가능)
//			: 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가
	}
}
