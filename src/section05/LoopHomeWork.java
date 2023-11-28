package section05;
/*

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
			i			j 0 ~ 6
   *   		0			0 1 2  j < 3-i  	4 5 6	j > 3+i
  ***		1			0 1				  	  5 6	j > 3+i
 *****		2			0					    6	j > 3+i
*******		3			
 *****		4  			0	   j < i - 3        6   j > 9-i
  ***		5			0 1	   j < i - 3      5 6	j > 9-i
   *		6			0 1 2  j < i - 3    4 5 6   j > 9-i
   
*/
public class LoopHomeWork {

	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i < 4) {
					if(j < 3-i) {
						System.out.print(" ");
					} else if (j > 3+i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					
				} else {
					if(j < i-3) {
						System.out.print(" ");
					} else if(j > 9-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
	
}












