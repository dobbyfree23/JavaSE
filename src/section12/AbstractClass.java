package section12;
/*
 * 추상클래스(Abstract Class)
 * 	일부 메서드가 구현되지 않은 추상메서드가 존재하는 클래스
 * 	abstract 키워드를 사용하여 선언한다.
 * 	객체 생성 불가 상속 후 추상메서드 오버라이드 후 사용가능
 * 
 */

public class AbstractClass {
	
	public static void main(String[] args) {
		Dog dog = new Dog("예삐");
		dog.eat();
		dog.makeSound();
	}

}
