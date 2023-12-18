package section17;

interface Greeting {
	void greet();	// 추상메서드
}

class GreetClass implements Greeting {

	@Override
	public void greet() {
		System.out.println("안녕하세요~");
	}
	
}

class GreetEngClass implements Greeting {

	@Override
	public void greet() {
		System.out.println("Hello~");
	}
	
}



public class AnoymousClass {
	
	public static void main(String[] args) {
		Greeting greet1 = new GreetClass();
		greet1.greet();
		
		Greeting greet2 = new GreetEngClass();
		greet2.greet();
		
		// 익명클래스
		Greeting greet3 = new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("이름없는 친구 안녕!");
			}
		};
		
		greet3.greet();
		
		
	}

}








