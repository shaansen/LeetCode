
public class Searcha2DMatrix {
	
	public static boolean search(int[][] matrix, int target, int row, int i, int j) {
		if(matrix[row][i] == target || matrix[row][j] == target) {
			return true;
		} else if(i<j) {
			int mid = (i+j)/2;
			if(matrix[row][mid] == target) {
				return true;
			} else if(matrix[row][mid] > target) {
				return search(matrix, target, row, i, mid-1);
			} else {
				return search(matrix, target, row, mid+1, j);
			}
		} else {
			return false;
		}
		
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = -1;
		for (int i = 0; i < matrix.length-1; i++) {
			if(matrix[i][0] <= target && matrix[i+1][0] > target) {
				row = i;
			}
		}
		if(matrix[matrix.length-1][0] <= target) {
			row = matrix.length-1;
		}
		return search(matrix, target, row, 0, matrix[0].length-1);
		
    }

	public static void main(String[] args) {
		int[][] matrix = {
				  {1,   3,  5,  7},
				  {10, 11, 16, 20},
				  {23, 30, 34, 50}
				};
		int target = 3;
		System.out.println(searchMatrix(matrix, target));

	}

}
