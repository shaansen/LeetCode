public class Searcha2DMatrixII {
	
	public static boolean search(int[][] matrix, int target, int i,int max_i, int j) throws InterruptedException {
		if(i>max_i) {
			return false;
		}
		int mid = (i+max_i)/2;
		if(matrix[mid][j] == target) {
			return true;
		} else if(matrix[mid][j] > target) {
			return search(matrix, target, 0, mid-1, j);
		} else if(matrix[mid][j] < target) {
			return search(matrix, target, mid+1, max_i, j);
		} else {
			return false;
		}
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) throws InterruptedException {
		
		if(matrix.length == 0 || matrix == null) {
			return false;
		}		
		
		boolean result = false;
		for (int j = 0; j < matrix[0].length; j++) {
			result = result ||  search(matrix, target, 0, matrix.length-1, j);
			if(result) {
				break;
			}
		}
        return result;
    }

	public static void main(String[] args) throws InterruptedException {
		
		int[][] matrix = {
				  {1,   4,  7, 11, 15},
				  {2,   5,  8, 12, 19},
				  {3,   6,  9, 16, 22},
				  {10, 13, 14, 17, 24},
				  {18, 21, 23, 26, 30}
				};
		int target = 20;
		System.out.println(searchMatrix(matrix, target));
	}

}
