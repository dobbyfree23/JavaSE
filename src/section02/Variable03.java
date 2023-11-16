package section02;
/*
 * 3. 정수형
 * 	byte	(1byte) : -128 ~ +127
 * 	short	(2byte) : -32,768 ~ +32,767
 * 	int		(4byte) : -2,147,483,648 ~ +2,147,483,647
 * 	long	(8byte) : -9,223,372,036,854,775,808 
 * 						~ +9,223,372,036,854,775,807
 * 
 */
public class Variable03 {
	
	public static void main(String[] args) {
		
		byte num1 = 20;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		// Ctrl + Alt + 방향키 -> 줄복사
		// Ctrl + s -> 저장
		// Ctrl + Shift + s -> 전체파일 저장
		// Ctrl + Shift + l -> 단축키 목록
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		// byte overflow
		num1 += 109;	// num1 = num1 + 109;
		System.out.println(num1);
		
	}

}
