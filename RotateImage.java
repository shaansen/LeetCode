
public class RotateImage {
	
	public static void printArray(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==============================");
	}
	
	public static void rotateImage(int[][] x) {
		int N = x.length;
		for (int i = 0; i < N/2; i++) {
			for (int j = i; j < N-1-i; j++) {
//				int temp = x[i][j];
//				x[i][j] = x[j][N-1-i];
//				x[j][N-1-i] = x[N-1-i][N-1-j];
//				x[N-1-i][N-1-j] = x[N-1-j][i];
//				x[N-1-j][i] = temp;
				int temp = x[N-1-j][i];
				x[N-1-j][i] = x[N-1-i][N-1-j];
				x[N-1-i][N-1-j] = x[j][N-1-i];
				x[j][N-1-i] = x[i][j];
				x[i][j] = temp;					
				
			}
		}
		printArray(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] x = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] x = {{1,2,3},{4,5,6},{7,8,9	}};
		printArray(x);
		rotateImage(x);

	}

}
