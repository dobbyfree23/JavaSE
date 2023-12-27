package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * try-with-resources
 * 	try 코드 블록이 끝나면 자동으로 resources를 close 해주는 기능
 * 
 * AutoCloseable 상속받은 클래스만 가능
 * 
 * 
 * 
 */
public class IO07 {
	
	public static void main(String[] args) {
		
		try(
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream("./upload/hello_copy3.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos); 
				
				PrintStream out = new PrintStream(bos, true);
				
				) {
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();
			
			out.println();
			out.println("===============================");
			out.println("PrintStream Test ... ");
			out.println("프린트 스트림 println 메서드 입니다.");
			out.println("===============================");
			
			System.out.println("복사가 완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
















