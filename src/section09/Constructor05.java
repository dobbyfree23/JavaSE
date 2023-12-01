package section09;

class Fruit {
	public String name = "사과";
	public int price;
	public String origin;
	
	public Fruit() {
		System.out.println("기본 생성자");
		this.name = "망고";
	}
	
	public Fruit(String name) { // 귤
		this.name = name;
		System.out.println("과일명: " + name);
	}
}


public class Constructor05 {
	public static void main(String[] args) {
				
		Fruit fruit = new Fruit("귤");
		System.out.println(fruit.name);
		
	}
}










