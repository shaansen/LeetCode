
public class PrintMatrixInSpirals {

	public static void printRow(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int x = -1;
		int y = -1;
		StringBuilder sb = new StringBuilder();
		
		while(rows>0 && cols>0) {
			x++;
			y++;
			// Covers 1 -> 2
			
			if(rows == 1 && cols == 1) {
				sb.append(arr[x][y]+" ");
			}
			
			for (int i = y; i < y+cols-1; i++) {
				sb.append(arr[x][i]+" ");
			}
			
			// Covers 3 -> 6
			int y1 = y + cols - 1;
			for (int i = x; i < x+rows-1; i++) {
				sb.append(arr[i][y1]+" ");
			}
			
			// Covers 9 -> 8
			int x1 = x + rows - 1;
			for (int i = y+cols-1; i >= y+1; i--) {
				sb.append(arr[x1][i]+" ");
			}
			
			// Covers 7 -> 4
			y1 = y;
			for (int i = x+rows-1; i >= x+1; i--) {
				sb.append(arr[i][y1]+" ");
			}
			
			rows -= 2;
			cols -= 2;
		}	
		System.out.println(sb.toString());
		System.out.println(sb.toString().split(" ").length);
	}
	
	public static void main(String[] args) {
		int[][] arr = {{01,02,03,04,05},{11,12,13,14,15}};
		printRow(arr);
	}
}
