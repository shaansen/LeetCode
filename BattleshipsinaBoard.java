public class BattleshipsinaBoard {
	
	public static boolean validTopLeft(char[][] board, int i, int j) {
			if(i==0) {
				if(j==0) {
					return true;
				}
				if(board[i][j-1]=='X') {
					return false;
				}
			}
			if(j==0) {
				if(i==0) {
					return true;
				}
				if(board[i-1][j]=='X') {
					return false;
				}
			}
			else if(i>0 && j>0 && (board[i-1][j]=='X' || board[i][j-1]=='X')) {
				return false;
			}
			return true;
	}
	
	public static int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]=='X' && validTopLeft(board, i, j)) {
					count++;
				}
			}
		}
        return count;
    }

	public static void main(String[] args) {
		char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		System.out.println(countBattleships(board));
	}

}
