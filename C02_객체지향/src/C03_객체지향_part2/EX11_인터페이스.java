package C03_객체지향_part2;

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable{
	void move(int x, int y);	// public abstract가 생략됨
	void attack(Fightable f);	// public abstract가 생략됨
}

class Fighter extends Unit implements Fightable{
	// 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
	public void move(int x, int y) {	
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	Fightable getFightable(){
		Fighter f = new Fighter();
		return f;
	}
}

public class EX11_인터페이스 {
	
//	인터페이스
//		: 추상 메서드의 집합
//		: 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)
//		: 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
//		: 다중 상속이 가능(추상메서드는 충돌해도 문제 없음)
	
//	인터페이스 구현
//		: 인터페이스의 추상메서드 몸통{} 만들기(미완성 설계도 완성하기)
//			class implements 인터페이스 이름{}
	
//	추상클래스와 인터페이스의 공통점?
//		-> 추상 메서드를 가지고 있다.
//	추상클래스와 인터페이스의 차이점?
//		-> 인터페이스는 iv를 가질 수 없다.
	
//	인터페이스를 이용한 다형성
//		: 인터페이스도 구현 클래스의 부모가 될 수 있다.
//		class Fighter extends Unit implements Fightable{}
//		: 인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능!!☆☆
//		: 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.
	
	public static void main(String[] args) {
		Fighter f  = new Fighter();
		f.move(1, 3);
		f.attack(new Fighter());
		f.getFightable();
	}
}
