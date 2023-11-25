package C03_객체지향_part2;

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water~!~!");
	}
}
class Ambulance extends Car{
	
}

public class EX09_참조변수의형변환 {
	
//	참조변수의 형변환
//		: 사용할 수 있는 멤버의 갯수를 조절하는 것
//		: 조상 자손 관계의 참조변수는 서로 형변환 가능!
	
	public static void main(String[] args) {
		FireEngine f = new FireEngine();
		Car c = (Car)f;	// OK. 조상인 Car타입으로 형변환 (생략가능)
		FireEngine f2 = (FireEngine)c;	// OK. 자손인 FireEngine타입으로 형변환(생략불가!)
//		Ambulance a = (Ambulance)f;		// 에러. 상속관계가 아닌 클래스 간의 형변환 불가..
		
//		------------------------------------------------
		
//		instanceof 연산자
//			: 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true 반환
//			: 형변환 전에 반드시 instanceof로 확인해야 함.
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof FireEngine);
//		-> 자기 조상은 true로 나옴! 따라서 자기자신과 자기 조상은 형변환이 가능
		
//		-------------------------------------------------
//		Q. 참조변수의 형변환은 왜 하는가?
//		A. 참조변수(리모컨)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해
		
//		Q. instanceof연산사는 언제 사용하나요?
//		A. 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때
		
	}

}
