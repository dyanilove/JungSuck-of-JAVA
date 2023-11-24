package C03_객체지향_part2;

class Point{
	int x;
	int y;
}

//class Circle extends Point{	// 상속
//	int r;
//}
class Circle{
	Point p = new Point();
	int r;
}

public class EX02_상속과포함 {
	
//	포함(composite)이란?
//		: 클래스의 멤버로 참조변수를 선언하는 것
//		: 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다.
	
//	ex)
//	class point{
//		int x; int y;}
//	class circle{
//		point c = new point();
//		int r;}		-> circle이 point를 포함
	
//	상속관계	: '~은 ~이다.(is - a)'
//	포함관계 	: '~은 ~을 가지고 있다.(has - a)'
	
	public static void main(String[] args) {
		Circle c = new Circle();
//		c.x = 1; c.y = 2; c.r=5;	// 상속일 경우
		c.p.x = 1; c.p.y = 2; c.r=5;
//		System.out.println(c.x);	// 상속일 경우
//		System.out.println(c.y);	// 상속일 경우
		System.out.println(c.p.x);	
		System.out.println(c.p.y);
		System.out.println(c.r);
	}
	
}
