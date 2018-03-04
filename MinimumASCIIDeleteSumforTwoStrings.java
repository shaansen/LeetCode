import java.util.Arrays;

public class MinimumASCIIDeleteSumforTwoStrings {
	
	public static int[] getCharArray(String s) {
		int[] result = new int[128];
		for (int i = 0; i < s.length(); i++) {
			result[s.charAt(i)]++;
		}
		return result;
	}
	
	public static int difference(int[] s,int[] t) {
		int result = 0;
		for (int i = 0; i < 128; i++) {
			result += Math.abs(s[i]-t[i])*i;
		}
		return result;
	}
	
	public static int minimumDeleteSum(String s1, String s2) {
		int[] s = getCharArray(s1);
		int[] t = getCharArray(s2);
		return difference(s, t);
    }

	public static void main(String[] args) {
		String s1 = "delete";
		String s2 = "leet";
		System.out.println(minimumDeleteSum(s1, s2));

	}

}
