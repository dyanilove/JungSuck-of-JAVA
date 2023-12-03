package Thread;

//쓰레드 구현하는덴 2가지 방법 있음

//1. Thread클래스를 상속
class MyThread extends Thread{
	public void run() {	// Thread클래스의 run()을 오버라이딩
		/* 작업 내용 */
	}
}

//2. Runnable인터페이스를 구현 (better,,,이렇게 자주 씀)
class MyThread2 implements Runnable{
	public void run() { 	// Runnable인터페이스의 추상메서드 run()을 구현
		/* 작업 내용 */
	}
}
public class EX02_쓰레드구현과실행 {
	public static void main(String[] args) {
//		1번 방식의 쓰레드 실행방법
		MyThread t1 = new MyThread();	// 쓰레드 생성
		t1.start();	//쓰레드의 실행
		
//		2번 방식의 쓰레드 실행방법
		Runnable r = new MyThread2();
		Thread t2 = new Thread(r); // Thread(Runnalbe r)
		// Thread t2 = new Thread(new MyThread2)); 위에 두줄 합친거
		t2.start();	// 쓰레드 실행
		
	}
}
