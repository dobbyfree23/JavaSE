package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 클래스에서 객체 타입 변환
 * 	서로 상속 관계에 있는 클래스 사이에서 변환할 수 있다.
 * 
 * 	1. 자동타입변환
 * 		부모클래스(타입) 객체변수명 = new 자식클래스();
 * 		부모클래스(타입) 객체변수명 = 자식객체변수;
 * 
 * 	2. 강제형변환 
 * 		부모타입으로 자동타입 변환 되었던 자식객체를
 * 		다시 자식타입으로 변환할 때만 가능하다.
 * 		
 * 		자식타입변수 = (자식타입)부모타입의 자식객체;
 * 
 * 다형성(Polymorphism)
 * 	객체 지향프로그래밍의 개념으로, 하나의 인터페이스나 클래스를 사용하여
 * 	여러 다른 타입의 객체를 다룰 수 있는 능력을 말한다.
 * 
 */
public class Polymorphism01 {
	
	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.onClickBell();
		
		Car car = new Bus();	// Bus 객체
		car.drive();		
		// car.onClickBell();	// 문법상 오류
		
		Bus bus2 = (Bus) car;
		bus2.drive();
		bus2.onClickBell();
		
	}

}




















