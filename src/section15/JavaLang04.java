package section15;
/*
 * StringBuffer - Thread Safe O
 * StringBuilder - Thread Safe X
 * 	문자열을 동적으로 다루기 위한 클래스
 * 
 */
public class JavaLang04 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.insert(1, "가나다");
		System.out.println(sb);
		
		sb.delete(2, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello,");
		sb2.append(" Java!");
		System.out.println(sb2);
		
		
	}

}













