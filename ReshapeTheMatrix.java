import java.util.*;

public class ReshapeTheMatrix {
	
	static public int[][] matrixReshape(int[][] nums, int r, int c) {
        
		if(r*c!=nums.length*nums[0].length) {
			return nums;
		}
		
		int result[][] = new int[r][c];
		int count = 0;
		int row_increment = -1;
		for(int i=0;i<nums.length;i++){
			for (int j = 0; j < nums[0].length; j++) {
				if(count%(c) == 0) {
					row_increment++;
				}
				result[row_increment][count++%c] = nums[i][j];
			}
		}
		
		
		return result;
    }
	
	public static void printArray(int[][] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] nums = {{1,2},{3,4}};
		int r = 1;
		int c = 4;
		int[][] x = matrixReshape(nums, r, c);
		printArray(x);
		
	}
}
