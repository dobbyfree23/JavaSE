package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 보조스트림
 * BufferedInputStream / BufferedOutputStream
 *	자바에서 성능을 향상시켜주기 위한 I/O 보조스트림 	
 * 
 * 
 */
public class IO05 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("./upload/hello.txt");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("./upload/hello_copy.txt");
			bos = new BufferedOutputStream(fos);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();
			
			System.out.println("파일 복사 완료!");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				
				if(bis != null) bis.close();
				if(fis != null) fis.close();
 			} catch (Exception e2) {
			}
			
		}
	}

}










