package section18;
/*
 * 스레드(Thread)
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 * 
 * 스레드 실행방법
 * 	1. Thread 클래스 상속
 * 	2. run() 메서드 오버라이드 구현
 * 	3. 1번에서 상속받은 클래스 객체생성
 * 	4. start() 메서드로 병렬 실행!!
 * 
 */
public class Thread01 {
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		new MyThread().start();
		
		try {
			Thread.sleep(1000);	// 1초 일시정시
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료!");
	}

}




















