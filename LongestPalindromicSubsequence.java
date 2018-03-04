import java.util.Arrays;

public class LongestPalindromicSubsequence {
	
	public static int[][] memo;
	
	public static int countPal(String s, int i, int j) {
		if(memo[i][j] == 0) {
			if(i == j) {
				memo[i][j] = 1;
			} else if( i+1 == j && s.charAt(i) == s.charAt(j)) {
				memo[i][j] = 2;
			} else if(s.charAt(i) == s.charAt(j)) {
				memo[i][j] = 2 + countPal(s, i+1, j-1);
			} else {
				memo[i][j] = Math.max(countPal(s, i+1, j), countPal(s, i, j-1));
			}
		} 
		return memo[i][j];
		
	}
	
	public static int longestPalindromeSubseq(String s) {
		memo = new int[s.length()][s.length()];
		return countPal(s, 0, s.length()-1);
    }

	public static void main(String[] args) {
		
		String s = "bbbab";
		System.out.println(longestPalindromeSubseq(s));
		
	}
}
