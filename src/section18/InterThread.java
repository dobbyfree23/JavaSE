package section18;

import java.text.SimpleDateFormat;
import java.util.Date;

import section07.Car;

public class InterThread extends Car  implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread 시작!");
		
		for(int i = 0; i < 30; i++) {
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
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
