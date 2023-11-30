package section09;
// tteokbokki
public class Tteopokki {
	
	// 속성
	public String brand;
	public String riceCake;
	public String sauce;
	public boolean isCheese;
	public int spicyLv;
	
	
	public Tteopokki() {
		this.brand = "죠스";
		this.riceCake = "쌀떡";
		this.sauce = "고추장";
		this.isCheese = false;
		this.spicyLv = 3;
	}
	
	// 오버로딩
	public Tteopokki(
			String brand, 
			String riceCake, 
			String sauce, 
			boolean isCheese, 
			int spicyLv
			) {
		this.brand = brand;
		this.riceCake = riceCake;
		this.sauce = sauce;
		this.isCheese = isCheese;
		this.spicyLv = spicyLv;
	}
	
	public void printInfo() {
		System.out.println("brand: " + brand);
		System.out.println("riceCake: " + riceCake);
		System.out.println("sauce: " + sauce);
		System.out.println("isCheese: " + isCheese);
		System.out.println("spicyLv: " + spicyLv);
	}

}












