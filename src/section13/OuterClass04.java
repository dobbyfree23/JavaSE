package section13;
/*
 * 지역 내부클래스
 * 	지역내부클래스는 메서드 내에서 선언되어 사용되는 클래스 이다.
 * 	클래스는 메서드 내에서만 사용가능
 * 	메서드 종료시 클래스도 종료
 * 
 * 
 */
public class OuterClass04 {
	
	private int speed = 10;
	
	public Object getUnit(String name) {
		
		class Unit {
			public void move() {
				System.out.println(name + "이 " + speed + " 속도로 이동합니다.");
			}
			
			@Override
			public String toString() {
				System.out.println(name + "이 " + speed + " 속도로 이동합니다.");
				return name + "@" + this.hashCode();
				
			}
		}
		
		Unit unit1 = new Unit();
		unit1.move();
		
		System.out.println(unit1.toString());
		
		return unit1;
		
	}
	
	
	public static void main(String[] args) {
		
		OuterClass04 outer = new OuterClass04();
		Object unit2 = outer.getUnit("마린");
		
		System.out.println(unit2.toString());
		
	}

}






