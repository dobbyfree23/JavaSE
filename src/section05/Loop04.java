package section05;
/*
 * 중첩 반복문
 * 
 */
public class Loop04 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			/*
			 * i = 0, j = 0 		print: *
			 * i = 1, j = 0 1		print: **
			 * i = 2, j = 0 1 2		print: *** 
			 * i = 3, j = 0 1 2 3	print: **** 
			 * i = 4, j = 0 		print: 
			 * i = 5, j = 0 		print: 
			 * i = 6, j = 0 		print: 
			 * i = 7 for문 종료!
			 * 
			 */
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}














