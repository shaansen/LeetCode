
public class NumberOfCornerRectangles {
	
	public static int countCornerRectangles(int[][] grid) {
        int count = 0;
        
        for (int i_0 = 0; i_0 < grid.length - 1; i_0++) {
			for (int j_0 = 0; j_0 < grid[0].length - 1; j_0++) {
				if(grid[i_0][j_0] == 1) {
					for (int i_1 = i_0 + 1; i_1 < grid.length; i_1++) {
						if(grid[i_1][j_0]==1) {
							for (int j_1 = j_0 + 1; j_1 < grid[0].length; j_1++) {
								if(grid[i_0][j_1]==1 && grid[i_1][j_1]==1) {
									count++;
								}
							}
						}
					}
				}
			}
		}
        
        return count;
    }

	public static void main(String[] args) {
//		int[][] grid = {{1, 0, 0, 1, 0},
//				 {0, 0, 1, 0, 1},
//				 {0, 0, 0, 1, 0},
//				 {1, 0, 1, 0, 1}};
		int[][] grid = {{1, 1, 1}};
//				 {1, 1, 1},
//				 {1, 1, 1}};
		System.out.println(countCornerRectangles(grid));
	}

}
