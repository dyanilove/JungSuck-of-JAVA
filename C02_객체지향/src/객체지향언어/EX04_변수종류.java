package 객체지향언어;

class Variables{
	int iv;		// 인스턴스 변수
	static int cv;		// 클래스 변수(static변수, 공유변수)
	
	void method() {
		int lv = 0;		// 지역 변수(메서드영역)
	}
}
class Card{
	String kind;
	int number;
	static int width=100;
	static int height = 250;
}

public class EX04_변수종류 {
//	클래스 변수와 인스턴스 변수
//	: 클래스 변수는 주로 공통속성, 인스턴스 변수는 주로 개별 속성일 때 사용.
//	 클래스변수는 객체생성없이 자동으로 사용 가능 
//	 인스턴스 변수는 객체 생성시 생성 되므로 그 때 사용가능

	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "spade";
		c1.number = 2;
		
		Card c2 = new Card();
		c2.kind = "heart";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+",의 "+c1.number+"이며, 크기는 "+c1.width+","+ c1.height);
		System.out.println("c2은 "+c2.kind+",의 "+c2.number+"이며, 크기는 "+c2.width+","+ c2.height);
	}

}
