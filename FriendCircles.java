
public class FriendCircles {
	
	static public boolean isSafe(int[][] M,int i,int j,boolean[][] visited) {
		return ((i>=0) && (i<M.length)) && ((j>=0) && (j<M[0].length)) && M[i][j]==1 && !visited[i][j];
	}
	
	static public void DFS(int[][] M,int i,int j,boolean[][] visited) {
		
		visited[i][j] = true;
		
		int i1 = i-1;
		int i2 = i+1;
		int j1 = j-1;
		int j2 = j+1;
		
		if(isSafe(M, i, j1, visited)) {
			DFS(M, i, j1, visited);
		}
		if(isSafe(M, i, j2, visited)) {
			DFS(M, i, j2, visited);
		}
		if(isSafe(M, i2, j, visited)) {
			DFS(M, i2, j, visited);
		}
		if(isSafe(M, i2, j, visited)) {
			DFS(M, i2, j, visited);
		}
		
		
	}
	
	static public int findCircleNum(int[][] M) {
        
		int rows = M.length;
		int cols = M[0].length;
		
		System.out.println(rows+" "+cols);
		int result = 0;
		
		boolean[][] visited = new boolean[rows][cols];
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				visited[i][j] = false;
//			}
//		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(M[i][j]==1 && !visited[i][j]) {
					DFS(M,i,j,visited);
					++result;
				}
			}
		}
		
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
           };
           
        int M2[][] = new int[][] {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(findCircleNum(M2));
	}

}
