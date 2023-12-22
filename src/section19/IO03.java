package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상클래스 이다.
 * 
 * FileInputStream
 * 	파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 * 
 */
public class IO03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			// FileInputStream - 해당경로 파일 읽을 준비를 하고 있다.
			fis = new FileInputStream("./upload/hello.txt");
			
			// upload2 디렉토리 생성
			File f1 = new File("./upload2");
			if(f1.mkdirs()) {
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
			
			// FileOutputStream - 해당경로의 파일에 쓸 준비를 한다.
			// 해당경로에 파일이 없을 경우 자동으로 생성해준다.
			// 단 디렉토리생성은 하지 않는다.
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[2];
			
			// (readByteCnt = fis.read(b)) != -1
			// readByteCnt = fis.read(b) - 파일을 읽어서 byte배열에 저장
			// fis.read(b) 더이상 읽을 데이터가 없을경우 -1 반환
			
			
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("파일복사 완료!");	
		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
			
			
			
		}
		
		
	}

}














