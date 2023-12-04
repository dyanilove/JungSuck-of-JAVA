package Thread;

public class EX10_쓰레드의동기화 {
	public static void main(String[] args) {
//		쓰레드의 동기화(synchronization)
//			: 멀티 쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있다.
//			: 진행중인 작업이 다른 쓰레드에게 간섭받지 않게 하려면 '동기화'가 필요
//			: 즉 '한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
//			: 동기화 하려면 간섭받지 않아야 하는 문장들을 '임계영역'으로 설정
//			: 임계영역은 락을 얻은 단 하나의 쓰레드만 출입가능(객체 1개에 락 1개)
		
//		synchronized를 이용한 동기화
//			: synchronized로 임계영역(lock이 걸리는 영역)을 설정하는 2가지 방법
		
//			1. 메서드 전체를 임계영역으로 지정
//				public sychronized void method1() {}	// 메서드 전체가 임계영역
		
//			2. 특정한 영역을 임계 영역으로 지정
//				public void method1() {
//					synchronized() {
//						// 임계영역
//					}
//				}
		
		Runnable r = new RunnableEx12();
		new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}

}
class Account {
	private int balance = 1000;

	public synchronized int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int money){
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
			balance -= money;
		}
	} // withdraw
}

class RunnableEx12 implements Runnable {
	Account acc = new Account();

	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	} // run()
}
