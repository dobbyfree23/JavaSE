package section02;
/*
 * 클래스(class)
 * 	자바에서 프로그램 개발하는 단위이다.
 * 	하나 이상의 클래스가 있어야 하며 소스 파일의 이름이
 * 	클래스 이름과 동일해야 한다. 
 * 
 * 메서드(method)
 * 	수행할 작업을 나열한 코드의 모임이다.
 * 	자바 프로그램의 시작 위치인 main() 메서드를 포함하는 
 * 	클래스가 반드시 있어야 한다.
 * 	
 * 이스케이프(Escape) 문자
 * 	특정한 문자 문자열을 특별한 용도로 해석하도록 하는 문자
 * 
 * 	\\ : 역슬래시 자체를 나타낸다.
 * 	\" : 쌍따옴표를 나타낸다.
 * 	\' : 작은따옴표를 나타낸다.
 * 	\n : 새 줄(줄 바꿈)을 나타낸다.
 * 	\t : 탭 문자를 나타낸다.
 * 	\r : 캐리지 리턴을 나타낸다.
 * 	\b : 백스페이스를 나타낸다.
 * 
 */

public class Escape {

	public static void main(String[] args) {
		
		System.out.println("\"Hello World!\""); // "Hello World!"
		System.out.println("\\");
		System.out.println("안녕하세요.\n이것은 줄 바꿈입니다.\n탭 간격: \t1\t2\t3");
		
	}
	
}








