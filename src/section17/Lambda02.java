package section17;

import java.util.ArrayList;
import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 * 	컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등을 효율적이고 간결하게 수행가능
 * 
 */
public class Lambda02 {
	
	public static void main(String[] args) {
		
		// List.of 만든 list 객체는 불변(immutable)이다. JAVA 9 이상 지원
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
	
		// printBasic(list);
		printFP(list);
		
	}
	
	private static void printBasic(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	private static void printFP(List<String> list) {
		list.stream()
			.forEach(e -> System.out.println("Fp-"+ e));
	}

}










