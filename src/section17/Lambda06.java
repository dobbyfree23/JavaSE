package section17;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer n) {
		
		return n % 2 == 0;
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer n) {
		return n * n;
	}
}

class SystemOutConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer n) {
		System.out.println("n: " + n);
	}
}






public class Lambda06 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		numbers.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * n)
			.forEach(n -> System.out.println(n));
		
		System.out.println("=================================");
		
		numbers.stream()
				.filter(new EvenNumberPredicate())
				.map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());
	}
}







