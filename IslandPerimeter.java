
public class IslandPerimeter {
	
	static public int islandPerimeter(int[][] grid) {
		int count = 0;
		int repeat = 0;
		
		int m = grid.length-1;
		int n = grid[0].length-1;
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if(grid[i][j]==1)
                {
                    count ++;
                    if(i!=0 && grid[i-1][j] == 1) repeat++;
                    if(j!=0 && grid[i][j-1] == 1) repeat++;
                }
			}
		}
        return 4*count-(2*repeat);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{0,1,0,0},
		             {1,1,1,0},
		             {0,1,0,0},
		             {1,1,0,0}};
		System.out.println(islandPerimeter(x));
	}

}
