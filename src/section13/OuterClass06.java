package section13;

import section13.access1.Bird;

public class OuterClass06 {
	
	public static void main(String[] args) {
		
		String name = new Bird() {
			private String name = "비둘기";
			
			@Override
			public void sing() {}
			
			@Override
			public void fly() {}
			
			public String getName() {
				return name;
			}
			
		}.getName();
		
		System.out.println("name: " + name);
	}

}














