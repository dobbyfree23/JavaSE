package section07;
/*
 * 변수(Variable)
 * 	데이터를 저장하고 관리하는데 사용되는 식별자
 * 
 * 변수 선언 및 초기화
 * 	자료형(Type) 변수명 = 값 또는 참조값(객체);
 * 
 * 	1. 타입의 따른 변수
 * 		기본형 - 예약어 되어있다. 소문자 시작, 직접 값을 저장하고 있다.
 * 			8가지 - boolean, char, byte, short, int, long, float, double
 * 		참조형 - 기본형 외 나머지 전부!! 참조(주소)값을 가지고 있다.
 * 			통상적으로 대문자로 시작
 * 			ex) String, Scanner, Math
 * 
 * 	2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스 안에 선언된 변수(멤버변수, 필드)
 * 				초기화 하지 않으면 default 값이 들어간다.
 * 					boolean - false
 * 					정수형 - 0
 * 					실수형 - 0.0d
 * 					참조형 - null
 * 
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				해당 메서드 안에서만 사용가능
 * 				메서드 종료시 같이 소멸된다.
 * 				매개변수도 지역변수이다.
 * 				지역변수는 초기화 필수!
 * 
 * 	3. 정적(static)/동적 변수
 * 
 */
public class Var01 {
	
	// 전역변수
	static int globalVar;
	
	public static void localMethod() {
		// 지역변수 선언
		int localVar = 20;
		System.out.println("전역변수 호출하기: " + globalVar);
		System.out.println("지역변수 호출하기: " + localVar);
	}
	
	public static void main(String[] args) {
		
		System.out.println("전역변수 호출하기: " + globalVar);
		// System.out.println("지역변수 호출하기: " + localVar);
		localMethod();
		
	}

}






