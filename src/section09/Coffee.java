package section09;

public class Coffee {
	
	public String bean;		// 원두
	public int water;		// 물
	
	public Coffee() {
		this.bean = "콜롬비아";
		this.water = 30;
		System.out.println("에소프레소");
	}
	
	public Coffee(int water) {
		this();		// 자기자신 생성자
		this.water += water;
		System.out.println("아메리카노");
	}
	
	public Coffee(String bean) {
		this.bean = bean;
		this.water = 30;
		System.out.println(bean + " 에소프레소");
	}
	
	public Coffee(String bean, int water) {
		this(bean);
		this.water += water;
		
		System.out.println(bean + " 아메리카노");
	}
	
	public void printInfo() {
		System.out.println("bean: " + bean);
		System.out.println("water: " + water);
	}

}







