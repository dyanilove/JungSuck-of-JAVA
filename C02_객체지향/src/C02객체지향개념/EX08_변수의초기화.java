package C02객체지향개념;

// 멤버 변수의 초기화
// 1. 명시적 초기화(=)
class Car{
	int coor =4;				// 기본형(primitive type) 변수의 초기화
//	Engine e = new Engine();	// 참조형(reference type) 변수의 초기화
}

// 2. 초기화 블럭(복잡한 초기화, 여러문장 넣기에 용이)
//	- 인스턴스 초기화 블럭 : {}		(잘 안씀,,, iv초기화는 주로 생성자로 초기화함..)
//	- 클래스 초기화 블럭	: static {}	(cv초기화할 때 사용)

class StaticBlockTest{
	static int arr[] = new int[10];	// 명시적 초기화
	
	static {	// 클래스 초기화 블럭 - 배열 arr을 난수로 채운다.
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}		
	}
}

// 3. 생성자	: iv초기화 & 복잡한 초기화 할 때

public class EX08_변수의초기화 {
	
//	지역변수(lv)는 수동 초기화해야함!!!(사용전에 꼭!!!)
//	멤버변수(iv,cv)는 자동초기화 된다.
	
//	클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번
//	인스턴스 변소 초기화 시점 : 인스턴스 생성될 때 마다

}
