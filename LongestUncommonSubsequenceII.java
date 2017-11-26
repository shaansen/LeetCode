import java.util.*;

public class LongestUncommonSubsequenceII {
	
	static public int findLUSlength(String a, String b) {
		System.out.println("Comparing "+a+" and "+b);
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
	
	static public int findLUSlength(String[] strs) {
     
	Set<String> set = new HashSet<String>();
	for (int i = 0; i < strs.length; i++) {
		set.add(strs[i]);
	}
	
	int t = -1;
	if(set.size()==1) {
		return -1;
	} else {
		String[] strs2 = set.toArray(new String[set.size()]);
		for (int i = 0; i < strs2.length-1; i++) {
			t = Math.max(t,findLUSlength(strs2[i],strs2[i+1]));
	     }
	}	
     
     return t;
    }
	
	public static void main(String args[]) {
		String[] strs = {"aba", "cdc", "eae"};
		String[] strs2 = {"aaa","aaa","aa"};
		String[] strs3 = {"aabbcc", "aabbcc","cb"};
		System.out.println(findLUSlength(strs3));
	}
}
