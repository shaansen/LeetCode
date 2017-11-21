import java.util.*;

public class LongestCommonSubsequence {
	
	static public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
		
	public static void main(String[] args) {
		System.out.println(findLUSlength("ABC","ABCD"));
	}

}
