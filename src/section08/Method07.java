package section08;

public class Method07 {
	
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 7, 12, 100};
		
		double[] result = summary(values);
		
		// 합계
		System.out.println("합계: " + result[0]);
		// 평균
		System.out.println("평균: " + result[1]);
		
	}
	
	public static double[] summary(int[] values) {
		// result[0] : 합계, result[1] : 평균
		double[] result = new double[2];
		
		int sum = 0;
		for(int val : values) {
			sum += val;
		}
		
		double avg = sum / (double) values.length;
		
		result[0] = sum;	// 합계
		result[1] = avg;	// 평균
		
		return result;
	}

}








