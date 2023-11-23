package C02객체지향개념;

public class EX07_생성자 {
	
//	생성자(constructor)
//	: 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
//	: 인스턴스 생성시 수행할 작업(iv 초기화)에 사용
//	: 이름이 클래스 이름과 같아야 한다.
//	: 리턴값이 없다(void 안 붙임)
//	: 모든 클래스는 반드시 생성자를 가져야 한다.
	
//	==========================================
//	생성자 this()
//	: 생성자에서 다른 생성자 호출할 때 사용
//	: 다른 생성자 호출 시 첫줄에서만 사용 가능
	

}
class card{
	card(){	//매개변수 없는 생성자
		
	}
	card(String kind, int number){	// 매개변수 있는 생성저
		
	}
}

// 생성자 this()
//	: 생성자에서 다른 생성자 호출할 때 사용
//	: 다른 생성자 호출 시 첫 줄에서만 사용가능
//예제)
class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
	}
	Car2(String color){
		this(color, "auto",4);
	}
	Car2(String color, String gearType, int door){
		// this.color는 iv, color는 lv
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


//====================================
// 참조변수 this
//	: 인스턴스 자신을 가르키는 참조변수
//	: 인스턴스 메서드(생성자포함)에서만 사용가능
//	: 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용!

//	※this와 this()는 비슷하게 생겼을 뿐 완전히 다른것이다. this는 '참조변수', this()는 '생성자'

