
public class ToeplitzMatrix {
	
	public static boolean isItTrue(int i, int j, int[][] arr) {
		if(i==arr.length-1 || j==arr[0].length-1) {
			return true;
		} else if(i+1<arr.length && j+1<arr[0].length && arr[i][j] == arr[i+1][j+1]) {
			return true && isItTrue(i+1, j+1, arr);
		}
		return false;
		
	}
	
	public static boolean isToeplitzMatrix(int[][] arr) {
		
		boolean result = true;
		
		for (int i = 0; i < arr.length; i++) {
			result = result && isItTrue(i, 0, arr);
		}
		
		for (int i = 0; i < arr[0].length; i++) {
			result = result && isItTrue(0, i, arr);
		}
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2},{2,2}};
		System.out.println(isToeplitzMatrix(arr));

	}

}
