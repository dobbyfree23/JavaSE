package section18;
/*
// 별찍기 크리스마스 트리 만들어봅시다!
			
			
 */
public class Thread05 {
	
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		new Thread(() -> {
			System.out.println("   ☆");
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 7; j++) {
					
					if(j < 3-i) {
						System.out.print(" ");
					} else if( j > i + 3) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("  | | Merry Christmas~*");
		}).start();
		
		new Thread( () -> System.out.println("익명 클래스 스레드2") ).start();
		
		System.out.println("메인 스레드 종료!");
	}
}



