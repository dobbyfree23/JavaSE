package section08;
/*
 * 재귀메서드(Recurisve Method)
 * 	메서드 내에서 자기자신을 호출하는 프로그래밍 기술을 말한다.
 * 
 */
public class Recursive {
	
	/*
	 * recursivePrintNumber(10)	-> 출력: 10
	 * 	recursivePrintNumber(9)	-> 출력: 9
	 * 		recursivePrintNumber(8) -> 출력: 8
	 * 			recursivePrintNumber(7) -> 출력: 7
	 * 				recursivePrintNumber(6) -> 출력: 6
	 * 					recursivePrintNumber(5) -> 출력: 5
	 * 						recursivePrintNumber(4) -> 출력: 4
	 *	 						recursivePrintNumber(3) -> 출력: 3
	 *								recursivePrintNumber(2) -> 출력: 2
	 *									recursivePrintNumber(1) -> 출력: 1
	 *										recursivePrintNumber(0) -> 
	 */
	
	public static void recursivePrintNumber(int n) {
		if(n > 0) {
			System.out.println("출력:" + n);
			recursivePrintNumber(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		recursivePrintNumber(10);
		
	}
}




