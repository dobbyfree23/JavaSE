package section13;

import section13.access1.Bird;

public class OuterClass08 {
	
	public Bird getBird() {
		
		Bird bird1 = new Bird() {
			
			@Override
			public void sing() {
				System.out.println("노래를 해요~");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
		};
		
		return bird1; 
	}
	
	public static void main(String[] args) {
		OuterClass08 outer = new OuterClass08();
		
		Bird bird2 = outer.getBird();
		
		bird2.sing();
		bird2.fly();
		
	}

}






