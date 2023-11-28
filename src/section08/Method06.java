package section08;

public class Method06 {
	
	public static void main(String[] args) {
		
		int max = max(10, 36);
		System.out.println("MAX : " + max);
		
		int max2 = max(1, 2, 3);
		System.out.println("MAX2 : " + max2);
		
	}
	
	// 6. 매개변수(인자) O, 리턴 O -> 인자값을 받아 연산 후 결과값 반환 메서드
	public static int max(int a, int b) {
		int max = a > b ? a : b;	// 삼항연산자
		return a > b ? a : b;
	}
	
	public static int max(int a, int b, int c) {
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		return max;
	}

}







