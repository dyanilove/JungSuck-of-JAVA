package Thread;

public class EX04_쓰레드의우선순위  {
	public static void main(String[] args) {
		
//		작업의 우선순위에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다.
//		void setPriority(int newPriority)	//쓰레드의 우선순위를 지정한 값으로 변경한다.
//		int getPriority()	// 쓰레드의 우선순위를 반환한다.
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();	// 쓰레드 생성
		
		th2.setPriority(7);
		
		System.out.println("th1의 우선순위 : " + th1.getPriority());
		System.out.println("th2의 우선순위 : " + th2.getPriority());	// 쓰레드의 우선순위 확인 (default : 5, 클수록 우선순위 높음)
		th1.start();
		th2.start();
	}
}

class Thread1 extends Thread{
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.print("-");
			for(int x = 0; x<100000; x++);	// 시간 지연용 for문
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			 System.out.print("|");
			 for(int x = 0; x<100000;x++);
		}
	}
}