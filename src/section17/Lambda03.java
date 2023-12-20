package section17;

import java.util.Arrays;
import java.util.List;

public class Lambda03 {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Bat", "Cat", "Dog"); 
		
		printBasicFiltering(list);
	}
	
	private static void printBasicFiltering(List<String> list) {
		
		for(String e : list) {
			if(e.endsWith("at")) {
				System.out.println(e);
			}
		}
	}
	
	private static void printFpFiltering(List<String> list) {
		
		list.stream()
			.filter(e -> e.endsWith("at"))
			.forEach(e -> System.out.println("FP-" + e));
		
	}

}





