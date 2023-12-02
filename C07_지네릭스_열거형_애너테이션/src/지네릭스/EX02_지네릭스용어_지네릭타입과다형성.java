package 지네릭스;

import java.util.ArrayList;
import java.util.List;

public class EX02_지네릭스용어_지네릭타입과다형성 {
	public static void main(String[] args) {
//		지네릭스 용어
//		 ▶ Box<T>	: 지네릭 클래스. 'T의 Box' 또는 'T Box'라고 읽는다.
//		 ▶ T		: 타입 변수 또는 타입 매개변수(T는 타입 문자)
//		 ▶ Box		: 원시타입(raw type)
		
//		지네릭 타입과 다형성
//			: 참조 변수와 생성자에 대입된 타입은 일치해야함.
		ArrayList<Tv> list = new ArrayList<Tv>();
//		ArrayList<Tv> list = new ArrayList<Product>();	// 에러. 불일치
			
//			: 지네릭 클래스간의 다형성은 성립
		List<Tv> list1 = new ArrayList<Tv>();	// ok. 다형성, ArrayList가 List구현
		
//			: 매개변수의 다형성도 성립
		ArrayList<Product> list2 = new ArrayList<Product>();
		
	}
}
