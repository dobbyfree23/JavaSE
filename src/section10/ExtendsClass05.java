package section10;

/*
 * final 클래스
 * 	클래스 키워드 앞에 final 키워드 선언 시 클래스 상속의 마지막임을 뜻한다.
 * 	상속불가 클래스!
 * 
 */

final class Cat {
	
	public String name;
	public void meow() {
		System.out.println("야옹~");
	}
}
// The type PersianCat cannot subclass the final class Cat
//  extends Cat 컴파일에러 발생!
class PersianCat {
	
}

public class ExtendsClass05 {

}







