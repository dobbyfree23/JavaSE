package section18;

public class CounterThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("CounterThread 시작!");
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i);
			
			try {
				Thread.sleep(1000);	// 1초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("CounterThread 종료!");
	}

}



