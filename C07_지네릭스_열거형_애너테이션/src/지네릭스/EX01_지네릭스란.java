package 지네릭스;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class EX01_지네릭스란 {
	public static void main(String[] args) {
//		지네릭스(Generics)란?
//			: 컴파일시 타입을 체크해 주는 기능
//			: 객체의 타입 안전성을 높이고, 형변환의 번거로움 줄여줌.
		
//		타입변수
//		: 클래스를 작성할 때, Object타입 대신 타입변수(E)를 선언해서 사용.
		
//		타입변수에 대입하기
//			: 객체를 생성시, 타입변수(E)대신 실제 타입(Tv)을 지정(대입)
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv>      tvList = new ArrayList<Tv>();		// Tv타입의 객체만 저장가능
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러.
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성

		productList.add(new Tv());
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());

		printAll(productList);
		// printAll(tvList); // 컴파일 에러가 발생한다.
		

	}
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
