package section09;

public class Constructor03 {
	
	public static void main(String[] args) {
		Coffee espresso = new Coffee();
		espresso.printInfo();
		
		System.out.println("===============");
		
		Coffee americano = new Coffee(350);
		americano.printInfo();
		
		System.out.println("===============");
		
		Coffee ethiopiaEspresso = new Coffee("에티오피아");
		ethiopiaEspresso.printInfo();
		
		System.out.println("===============");
		Coffee kenyaAmericano = new Coffee("케냐", 350);
		kenyaAmericano.printInfo();
		
		
		
	}

}
