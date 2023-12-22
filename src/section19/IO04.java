package section19;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

// https://img.freepik.com/free-vector/paper-style-christmas-background_23-2149159393.jpg


public class IO04 {
	
	public static void main(String[] args){
		
		String fileUrl = "https://img.freepik.com/free-vector/paper-style-christmas-background_23-2149159393.jpg";
		String savePath = "./upload/image1.jpg";
		
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
		try {
			URL url = new URL(fileUrl);
			
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream(savePath);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("File Download Done!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if(fos != null) fos.close();
				if(bis != null) bis.close();
			} catch (Exception e2) {
			}
		}
		
	}

}
