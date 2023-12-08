package section14;
/*
 * Exception 종류
 * 	1. UnChecked Exception (RuntimeException)
 * 		메서드 호출시 예외처리 하지 않아도 컴파일 에러가 발생하지 않는다.
 * 		RuntimeException 상속받은 Exception 클래스
 * 	2. Checked Exception
 * 		메서드 호출시 예외처리 하지 않을 경우 컴파일 에러 발생!
 * 
 */
public class ExceptionClass04 {
	
	public static void main(String[] args) {
		
		// new ExceptionClass04().unCheckedMethod();	// Unchecked Exception
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				// 1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void unCheckedMethod(){
		
		int num1 = 10;
		int num2 = 0;
		
		int result = num1 / num2;
		 
		System.out.println("result: " + result);
	}

}








