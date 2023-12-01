package section10;
/*
 * super 키워드
 * 	슈퍼클래스의 멤버를 참조하는 키워드
 * 
 * ***** 오버라이딩(Overriding)
 * 	상속받은 메서드를 자식클래스에서 재정의 하는것을 말한다.
 * 
 * 어노테이션(Annotation)
 * 	자바프로그래밍 언어에서 메타정보를 첨부하는 방법중 하나이다.
 * 
 */
public class ExtendsClass03 {
	public static void main(String[] args) {
		
		Latte latte = new Latte();
		latte.bean = "칠레";
		latte.brand = "네스카페";
		latte.water = 200;
		latte.milk = 100;
		
		latte.printInfo();
		
	}
}















