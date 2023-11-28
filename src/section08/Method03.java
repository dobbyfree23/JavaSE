package section08;
/*
 * *****오버로딩(Overloading)
 * 	클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하는 것을 말한다.
 * 	매개변수 개수, 타입, 타입순서가 다르면 선언 가능하다.
 * 
 */

public class Method03 {
	
	public static void main(String[] args) {
		
		printPokeMon("025", "피카츄", 250);
		
		String no = "001";
		String name = "이상해씨";
		int hp = 300;
		printPokeMon(no, name, hp);
		
		System.out.println("=======================");
		
		printPokeMon("025", "피카츄", "전기");
		
		System.out.println("=======================");
		
		printPokeMon("001", "이상해씨", 350, "풀");
		
	}
	
	// 3. 매개변수(인자) - 여러개 O, 리턴 X -> 여러 인자값을 받아 실행되는 메서드
	public static void printPokeMon(String no, String name, int hp) {
		System.out.println("No. " + no);
		System.out.println("Name : " + name);
		System.out.println("HP : " + hp);
	}
	
	// 오버로딩(overloading) 메서드
	public static void printPokeMon(String no, String name, String type) {
		System.out.println("No. " + no);
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
	}
	
	public static void printPokeMon(String no, String name, int hp, String type) {
		printPokeMon(no, name, hp);
		System.out.println("Type: " + type);
	}
	
}







