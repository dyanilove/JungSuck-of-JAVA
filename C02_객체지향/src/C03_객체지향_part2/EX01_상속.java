package C03_객체지향_part2;

class Tv{
	boolean power;	
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv{
	boolean caption;
	void displayCaption(String text) {	// SmartTv는 Tv에 자막을 보여주는 기능
		if(caption) {					
			System.out.println(text);
		}
	}
}

public class EX01_상속 {
	
//	상속(Inheritance)
//		: 기존의 클래스로 새로운 클래스를 작성하는 것(코드의 재사용)
//		: 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
//		: 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외)
//		: 자손의 멤버 개수는 조상보다 적을 수 없다.(같거나 많음)
	
	public static void main(String[] args) {
		SmartTv st = new SmartTv();
		st.channel = 38;	// 조상 클래스로 부터 상속받은 멤버
		st.channelUp();		// 조상 클래스로 부터 상속받은 멤버
		
		System.out.println(st.channel);
	}

}

