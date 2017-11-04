
public class MaxAreaofIsland {
	
	public static boolean[][] visited;
	
	static public int getCount(int[][] grid, int i,int j) {
		
		if(i== -1 || j == -1 || i == grid.length || j == grid[0].length || visited[i][j]) {
			return 0;
		}
		
		visited[i][j] = true;
		if(grid[i][j]==0) {
			return 0;
		}
		
		return grid[i][j] + getCount(grid, i+1, j) + getCount(grid, i, j+1) + getCount(grid, i-1, j) + getCount(grid, i, j-1);
	}
	
	static public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        
        visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				visited[i][j] = false;
			}
		}
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1) {
					max = Math.max(getCount(grid, i, j),max);
				}
			}
		}
        return max;
    }
	
	public static void main(String[] args) {
		int[][] x = {	{0,0,1,0,0,0,0,1,0,0,0,0,0},
				 		{0,0,0,0,0,0,0,1,1,1,0,0,0},
				 		{0,1,1,0,1,0,0,0,0,0,0,0,0},
				 		{0,1,0,0,1,1,0,0,1,0,1,0,0},
				 		{0,1,0,0,1,1,0,0,1,1,1,0,0},
				 		{0,0,0,0,0,0,0,0,0,0,1,0,0},
				 		{0,0,0,0,0,0,0,1,1,1,0,0,0},
				 		{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		int[][] y = {	{1,1,0,0,0},
						{1,1,0,0,0},
						{0,0,0,1,1},
						{0,0,0,1,1}};
		
		System.out.println(maxAreaOfIsland(y));
	}

}
