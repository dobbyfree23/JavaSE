package section17;

import java.util.List;

public class Lambda04 {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
	
//		System.out.println("합계: " + sum(numbers));
		System.out.println("합계: " + fpSum(numbers));
	}
	
	private static int sum(List<Integer> numbers) {
		int sum = 0;
		for(int num : numbers) { 
			sum += num;
		}
		return sum;
	}
	
	// reduce - 스트림 요소들을 결합하여 단일결과 생성
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
					.reduce(0, (sum, num) -> sum + num);
	}
	

}






