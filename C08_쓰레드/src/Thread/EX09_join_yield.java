package Thread;

public class EX09_join_yield {
	static long startTime = 0;
	public static void main(String[] args) {
//		join()
//			: 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.
//			: 예외처리 해야 한다.
		
		Thread5 th1 = new Thread5();
		Thread6 th2 = new Thread6();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();	// main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}

		System.out.print("소요시간:" + (System.currentTimeMillis() - EX09_join_yield.startTime));
		
//		yield()
//			: 남은 시간을 다음 쓰레드에게 양보하고, 자신(현재쓰레드)은 실행대기한다.
//			: yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.
	}

}
class Thread5 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	} // run()
}

class Thread6 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}
