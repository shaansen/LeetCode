
public class NumberofIslands {
	
	public static boolean visited[][];
	
	static public int getCount(char[][] grid, int i,int j) {
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]=='0' || visited[i][j]) {
			return 0;
		}
		
		visited[i][j] = true;
		return 1+getCount(grid, i+1, j)+getCount(grid, i-1, j)+getCount(grid, i, j+1)+getCount(grid, i, j-1);
		
	}
	
	static public int numIslands(char[][] grid) {
		
		if(grid.length == 0) {
			return 0;
		}
		
		visited = new boolean[grid.length][grid[0].length];
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j]== '1') {
					if(getCount(grid,i,j) >= 1) {
						count++;
					}
				}
			}
		}
		return count;
		
    }

	public static void main(String[] args) {
		
		char x[][] = {	{'1','1','1','1','0'},
						{'1','1','0','1','0'},
						{'1','1','0','0','0'},
						{'0','0','0','0','0'}};

		char y[][] = {	{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'}};
		
		char z[][] = {};
		
		System.out.println(numIslands(z));
	}
}
