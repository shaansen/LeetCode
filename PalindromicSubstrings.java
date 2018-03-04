
public class PalindromicSubstrings {
	
	public static int isPal(int i,int j, String s) {
		if (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
			return 1+isPal(i-1, j+1, s);
		}
		return 0;
	}
	
	public static int countSubstrings(String s) {
		
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
        	int j = i;
        	count += isPal(i, j, s) + isPal(i, j+1, s);
		}
        return count;
    }

	public static void main(String[] args) {
		System.out.println(countSubstrings("abxba"));

	}

}
