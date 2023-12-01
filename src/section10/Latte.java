package section10;

public class Latte extends Espresso {
	int water;
	int milk;
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("오버라이딩 메서드!");
	}
}














