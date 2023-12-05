package section11.access2;

public class Coffee extends Drink {
	
	public boolean isDecaf;
	
	public Coffee() {
		name = "클래식밀크커피";
		type = "Coffee";
		price = 2000;
		isDecaf = false;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("isDecaf: " + isDecaf);
	}

}








