import java.util.*;

public class LongestCommonSubsequence {
	
	static public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
		
	public static void main(String[] args) {
		System.out.println(findLUSlength("AA","AAAA"));
	}

}
