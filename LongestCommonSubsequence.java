
public class LongestCommonSubsequence {
	
	public static int LCS(char[] x,char[] y,int na,int nb) {
		if(na==-1 || nb==-1) {
			return 0;
		}
		if(x[na]==y[nb]) {
			return 1+LCS(x, y, na-1, nb-1);
		} else {
			return Math.max(LCS(x, y, na, nb-1),LCS(x, y, na-1, nb));
		}
	}
	
	public static int LCSDriver(String a,String b) {
		char[] chA = a.toCharArray();
		char[] chB = b.toCharArray();
		return LCS(chA,chB,chA.length-1,chB.length-1);
	}
	
	public static void main(String[] args) {
		System.out.println(LCSDriver("AGGTAB","GXTXAYB"));
	}

}
