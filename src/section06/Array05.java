package section06;

public class Array05 {
	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		// 2중배열 전체 출력하기
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
