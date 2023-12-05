package section10.access2;

import section10.access1.Car;

public class SportCar extends Car {
	
	private boolean isOpen;
	
	@Override
	public void printInfo() {
		System.out.println("오버라이드 model: " + model);
		System.out.println("오버라이드 color: " + color);
		// System.out.println("오버라이드 year: " + year);
		// System.out.println("오버라이드 brand: " + brand);
		System.out.println("오버라이드 isOpen: " + isOpen);
		
	}
	
}
