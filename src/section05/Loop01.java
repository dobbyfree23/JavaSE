package section05;
/*
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 * 
 * 1. while문
 * 	while(조건식) {
 * 		반복 수행할 코드
 * 	}
 * 
 * break문
 * 	반복문에서 break명령어는 해당 반복문을 즉시 종료하는 명령어
 * 
 * continue문
 * 	반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어
 * 
 */
public class Loop01 {
	
	public static void main(String[] args) {
		// while문을 이요하여 1~100 까지 출력
		/*
		int count = 1;
		while(count <= 100) {
			System.out.println(count);
			count++;
		}
		*/
		
		/*
		int count = 1;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			if(count == 100) isRun = false;
			count++;
		}
		*/
		
		/*
		int count = 1;
		while(true) {
			System.out.println(count);
			if(count == 100) break;
			count++;
		}
		*/
		
		int count = 0;
		while(count < 100) {
			
			count++;
			
			if(count % 3 == 0) continue;
			
			System.out.println(count);
		}
				
	}
}











