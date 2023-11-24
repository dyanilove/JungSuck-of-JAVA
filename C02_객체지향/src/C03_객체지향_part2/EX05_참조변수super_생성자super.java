package C03_객체지향_part2;

public class EX05_참조변수super_생성자super {
	
//	참조변수 super 	(≒this)
//		: 객체 자신을 가르키는 참조변수. 인스턴스 메서드(생성자)내에만 존재(static메서드에서 사용 불가..)
//		: 조상의 멤버를 자신의 멤버와 구별할 때 사용
	
//	==================================


	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}

class Parent{int x = 10; /* super.x */}

class Child extends Parent{
	int x = 20; 	// this.x
	
	void method() {
		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
	}
}

//super() - 조상의 생성자
//	: 생성자의 첫 줄에는 반드시 생성자를 호출해야 한다!!☆☆☆
//	: 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();을 삽입

class Point1{
	int x,y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D1 extends Point1{
	int z;
	
	Point3D1(int x, int y, int z){
		super(x,y);	// 조상클래스의 생성자 point1(int x, int y)를 호출
		this.z = z;	// 자신의 멤버를 초기화
	}
}

