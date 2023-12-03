package Thread;

import javax.swing.JOptionPane;

public class EX07_sleep_interrupt메서드 {
	public static void main(String[] args) {
//		◆ sleep()
//			: 현재 쓰레드를 지정된 시간동안 멈추게 한다.
//			-> static void sleep(longmillis)	//천분의 일초 단위
//			-> static void sleep(longmillis, int nanos)	//천분의 일초 + 나노초
//			: 예외처리해야한다.
//			: 특정 쓰레드를 지정해서 멈추게 하는건 불가능
//		try {
////			th1.sleep(2000);		// 이렇게 말고 밑에처럼 써야함.
//			Thread.sleep(1,500000);		//쓰레드를 0.0015초 동안 멈추게 한다.
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
		
//		-------------------------------
//		◆ interrupt()
//			: 대기상태인 쓰레드를 실행대기상태로 만든다.
//			-> void interrupt()				: 쓰레드의 interrupted상태를 false에서 true로 변경
//			-> boolean isInterrupted()		: 쓰레드의 interrupted상태를 반환
//			-> static boolean interrupted()	: 현재 쓰레드의 interrupted상태를 알려주고, false로 초기화
		
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
	}

}
class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // 시간 지연
		}
		System.out.println("카운트가 종료되었습니다.");
	} 
}