package section02;
/*
 * 5. String 형 (문자열)
 * 	자바에서 문자열을 저장할 수 있는 타입
 * 	참조형 변수
 * 
 * 선언방법
 * 	String 변수명;
 * 
 * 기본자료형(primitive type)
 * 	실제 데이터 값을 저장한다. 정수, 실수, 논리 타입으로 분류된 8가지 자료형이다.
 * 	각각 저장 크기가 다르며 기본값이 정해져 있다.
 * 	예) boolean, char, byte, short, int, long, float, double 
 * 
 * 참조자료형(reference type)
 * 	데이터가 저장되어 있는 메모리 번지를 저장한다. 
 * 	기본자료형을 제외한 나머지 사용자 정의 자료형을 말하며, 
 * 	기본값이 정해져 있지 않기 때문에 null값이 존재한다.
 * 	클래스 코드로 되어있다.
 * 	속성(값-변수), 기능(메서드)
 * 	
 * 
 * 	예) String
 * 
 * 
 */
public class Variable06 {
	
	public static void main(String[] args) {
		// String 변수선언 및 초기화
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/*
		 * h e l l o 
		 * 0 1 2 3 4  => 인덱스번호
		 */
		String hello = "hello";
		System.out.println("1번 인덱스 문자: " + hello.charAt(1));
		System.out.println("hello.replace: " + hello.replace("o", "a"));
		
		
		System.out.println(System.identityHashCode(hello));
		
	}

}
