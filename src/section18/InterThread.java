package section18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterThread implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread 시작!");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for(int i = 0; i < 30; i++) {
			
			String now = sdf.format(date);
			System.out.println("Now: " + now);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("InterThread 종료!");
	}

}
