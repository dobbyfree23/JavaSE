package section09;

public class Constructor02 {
	
	public static void main(String[] args) {
		
		Tteopokki tteopokki = new Tteopokki("엽기떡볶이", "밀떡", "고추장", true, 2);
		
		tteopokki.printInfo();
		
		System.out.println("==========================");
		
		
		Tteopokki tteopokki2 = new Tteopokki();
		tteopokki2.printInfo();
		
	}

}



