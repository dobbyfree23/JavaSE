package section15;
/*
 * 1. 얕은복사(Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사
 * 	- 동일한 객체 참조한다.
 * 
 * 2. 깊은복사(Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	- 새로운(다른) 객체를 참조하게 된다.
 * 
 */

public class JavaLang02 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		SoccerTeam soccer1 = new SoccerTeam("토트넘", "런던", "1882", "프리미어리그");
		
		SoccerTeam soccer2 = soccer1;
		
		SoccerTeam soccer3 = (SoccerTeam) soccer1.clone();
		
		if(soccer1.equals(soccer2)) {
			System.out.println("soccer1 과 soccer2는 같습니다.");
		} else {
			System.out.println("soccer1 과 soccer2는 다릅니다.");
		}
		
		System.out.println(soccer1);
		System.out.println(soccer2);
		System.out.println(soccer3);
		
		if(soccer1.equals(soccer3)) {
			System.out.println("soccer1 과 soccer3은 같습니다.");
		} else {
			System.out.println("soccer1 과 soccer3은 다니다.");
		}
		
	}

}









