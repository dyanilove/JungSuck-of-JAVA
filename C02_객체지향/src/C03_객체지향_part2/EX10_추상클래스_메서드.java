package C03_객체지향_part2;

abstract class Player{	// 추상 클래스
	abstract void play(int pos);	// 추상 메서드
	abstract void stop();			// 추상 메서드
}
class AudioPlayer extends Player{
	void play(int pos) {	// 추상 메서드 구현
		System.out.println(pos+"위치부터 play합니다.");
	}
	void stop() {			// 추상 메서드 구현
		System.out.println("재생을 멈춥니다.");
	}
}

abstract class AbstractPlayer extends Player{	// 추상 메서드를 구현했지만 Player에 있는 모든 추상메서드를 구현한게 아니라서 추상클래스가 된다.
	void play(int pos) {	// 추상 메서드 구현
		
	}
}

public class EX10_추상클래스_메서드 {

//	추상 클래스
//		: 미완성 설계도, 미완성 메서드를 가지고 있는 클래스
//		: 다른 클래스 작성에 도움을 주기 위한 것
//		: 인스턴스 생성이 불가능하다.
//		: 상속을 통해 추상 메서드를 완성해야 인서턴스 생성 가능.
	
//	추상 클래스의 작성
//		: 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존 클래스의 공통부분을 뽑아서 추상클래스를 만든다.
	
//	추상 메서드
//		: 미완성 메서드. 구현부(몸통{})가 없는 메서드
//		: 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용.
//		: 추상 메서드 호출 가능(호출할 때는 선언부만 필요)
	
	
//	추상화의 장점 : 추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리..

	
	public static void main(String[] args) {
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();	// 다형성
		ap.play(29);
		ap.stop();
	}
}
