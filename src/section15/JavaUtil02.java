package section15;

import java.util.Arrays;
import java.util.Random;

public class JavaUtil02 {
	
	public static void main(String[] args) {
		
		int[] iArray = new int[45];
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
		}
		
		Random ran = new Random();
		for(int i = 0; i < iArray.length; i++) {
			
			int cIndex = ran.nextInt(45);	// 0 ~ 44 중 난수값생성
			
			int tmp = iArray[i];
			iArray[i] = iArray[cIndex];
			iArray[cIndex] = tmp;
		}
		
		int[] resultArray = new int[6]; 
		for(int i = 0; i < resultArray.length; i++) {
			resultArray[i] = iArray[i];
		}
		
		Arrays.sort(resultArray);
		System.out.println(Arrays.toString(resultArray));
		
		
	}

}








