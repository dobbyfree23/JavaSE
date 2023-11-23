package section07;
/*
 * 상수
 * 	처음 할당된 값이 변경되지 않는 변수
 * 	final 예약어 사용.
 * 	보통 대문자로 선언한다.
 * 
 * 리터럴(literal)
 * 	프로그래밍 언어에서 고정된 값을 나타내는 표기법이다.
 * 	
 * 
 */
public class Constant {
	
	public static void main(String[] args) {
		
		// 상수 선언
		final double PI = 3.141592;
		
		// PI = 3.2; 상수 수정불가!
		
		int r = 10;
		
		double area = PI * r * r;
		System.out.println("원의 넓이: " + area);
		
		// 리터럴 예
		int number = 42; // 42 는 정수 리터럴
		long bigNumber = 1234567890L;	// 큰 정수 리터럴  L 또는 l 붙임
		
		double pi = 3.14159265359; // 부동소수점 리터럴
		float f = 2.0f; // 부동소수점 리터럴 (f 또는 F를 붙임)
		
		String greeting = "Hello, World!"; // 문자열 리터럴
		
		boolean isJavaFun = true; // 부울린 리터럴
		
		char grade = 'A'; // 문자 리터럴
		
		String noValue = null; // null 리터럴

	}

}









