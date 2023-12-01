package section10;
/*
 * super()
 * 	부모클래스의 생성자를 의미한다.
 * 
 * 
 */
class Car {
	String model;
	String color;
	
	public Car() {
		System.out.println("Car 생성자");
	}
}

class SportCar extends Car {

	public SportCar() {
		super();
		System.out.println("SportCar 생성자");
	}
}

public class ExtendsClass04 {
	public static void main(String[] args) {
		SportCar sCar = new SportCar();
	}

}











