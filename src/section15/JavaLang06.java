package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 	기본 자료형을 객체로 감싸서 사용할 수 있도록 해주는 클래스
 * 	기본자료형 래퍼클래스 8가지
 * 		- Boolean, Character, Byte, Short, Integer, Long, Float, Double
 * 
 * 
 */
public class JavaLang06 {
	
	public static void main(String[] args) {
		String strNumber = "12345";
		
		// parseInt 메서드로 문자열 int형으로 반환
		int num = Integer.parseInt(strNumber);
		System.out.println("num: " + (num + 1));
		
		Integer num2 = 10;	// 오토박싱
		int num3 = 10; 		// 오토언박싱
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는것을 권장
		Integer num4 = new Integer(10);
		Integer num5 = Integer.valueOf(10);	
		
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num3));
		System.out.println(System.identityHashCode(num4));
		System.out.println(System.identityHashCode(num5));
		
		// 실수형 타입 선언
		Double doubleNum = Double.valueOf(3.141592);
		Double doubleNum2 = Double.parseDouble("3.141592");
		
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
		Character ch2 = 'B';
		
	}

}















