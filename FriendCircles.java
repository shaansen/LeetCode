import java.util.Arrays;

public class FriendCircles {
	
	public static boolean isTopLeft(int[][] M, int i, int j) {
		if(i == 0) {
			if(j == 0) {
				return true;
			}
			return M[i][j-1]!=1;
		}
		if(j == 0) {
			if(i == 0) {
				return true;
			}
			return M[i-1][j]!=1;
		}
		return M[i-1][j]!=1 && M[i][j-1]!=1;
	}
	
	static public int findCircleNum(int[][] M) {
		int count = 0;
        for (int i = 0; i < M.length; i++) {
        	System.out.println(Arrays.toString(M[i]));
			for (int j = 0; j < M[0].length; j++) {
				if(M[i][j] == 1 && isTopLeft(M, i, j)) {
					count++;
				}
			}
		}
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M1[][] = new int[][] {{1, 1, 0},{1, 1, 0},{0, 0, 1}};
        int M2[][] = new int[][] {{1,1,0},{1,1,1},{0,1,1}};
        int M3[][] = new int[][] {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        System.out.println(findCircleNum(M3));
	}

}
