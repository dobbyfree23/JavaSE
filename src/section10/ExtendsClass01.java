package section10;
/*
 * 상속(Inheritance)
 * 	부모클래스(슈퍼클래스, 상위클래스)와 자식클래스(서브클래스, 하위클래스)가 있으며
 * 	자식클래스는 부모클래스를 상속받아 그 부모의 멤버(변수, 메서드)를 사용할 수 있다.
 * 
 * 상속방법
 * 	class 서브클래스명 extends 슈퍼클래스명
 * 
 * 
 */
public class ExtendsClass01 {
	
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		coffee.bean = "브라질";
		System.out.println("coffee bean: " + coffee.bean);
		
		System.out.println("==========================");
		
		Espresso espresso = new Espresso();
		espresso.brand = "스타벅스";
		espresso.bean = "에티오피아";
		
		System.out.println("espresso brand: " + espresso.brand);
		System.out.println("espresso bean: " + espresso.bean);
		
		
		
		
	}

}













