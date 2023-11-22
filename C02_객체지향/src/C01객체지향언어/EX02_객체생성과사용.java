package C01객체지향언어;

class Tv{
	// TV의 속성(변수)
	String color;
	boolean power;
	int channel;
	
	// TV의 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class EX02_객체생성과사용 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
		
		t1.channel = 38;
		System.out.println("t1의 채널값을 38번으로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
		
		t2 = t1;	//참조변수 t1의 값을 t2에 저장
		
		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");

	}

}
