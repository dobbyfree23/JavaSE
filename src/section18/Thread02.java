package section18;

public class Thread02 {
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		CounterThread ct = new CounterThread();
		ct.setName("CounterThread01");
		ct.start();
		CounterThread ct2 = new CounterThread();
		ct2.setName("CounterThread02");
		ct2.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i * 100);
			
			try {
				Thread.sleep(500);	// 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인 스레드 종료!");
	}

}




