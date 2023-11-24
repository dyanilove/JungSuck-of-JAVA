package C03_객체지향_part2;

class MyPoint{
	int x; int y;
	String getLocation() {
		return "x : " +x + ", y : "+y;
	}
}

class MyPoint3D extends MyPoint{
	int z;
	String getLocation() {	// 조상의 getLocation오버라이딩
		return "x : " +x + ", y : "+y + ", z : "+z;
	}
}

public class EX04_오버라이딩 {
	
//	오버라이딩(Overriding)
//		: 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
	
	public static void main(String[] args) {
		MyPoint3D mp3 = new MyPoint3D();
		mp3.x = 3; mp3.y = 4; mp3.z = 7;
		System.out.println(mp3.getLocation());
		
	}
	
//	오버라이딩의 조건
//		1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
//		2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//		3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
	
//	오버로딩 VS 오버라이딩
//	- 오버로딩 : 기존에 없는 새로운 메서드를 정의하는 것.
//	- 오버라이딩 : 상속받은 메서드의 내용을 변경하는 것.
	

}
