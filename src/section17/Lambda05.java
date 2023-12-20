package section17;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda05 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		// map - 각 요소의 연산 반영하기
		numbers.stream()
			.map(e -> e * e)
			.forEach(e -> System.out.println(e));
		
		System.out.println("=================================");
		
		List<Integer> list = numbers.stream()
									.map(e -> e * 2)
									.collect(Collectors.toList());
		
		
		numbers.stream().forEach(e -> System.out.println(e));
		list.stream().forEach(e -> System.out.println("LIST-" + e));
		
		
		
		
	}

}




