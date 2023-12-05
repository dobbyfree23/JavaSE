package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		
		// 1 Car 2 Bus  3 SchoolBus 
		
		SchoolBus sBus = new SchoolBus();
		SchoolBus sBus2 = new SchoolBus();
		sBus.drive();		// 3
		System.out.println(System.identityHashCode(sBus));
		System.out.println(System.identityHashCode(sBus2));
		
		Car car = sBus;
		car.drive();		// 3
		System.out.println(System.identityHashCode(car));
		
		Bus bus = (Bus)car;
		bus.drive();		// 3
		System.out.println(System.identityHashCode(bus));
		
	}

}





