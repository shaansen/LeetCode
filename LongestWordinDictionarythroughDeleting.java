import java.util.*;

public class LongestWordinDictionarythroughDeleting {
	
	static public String findLongestWord(String s, List<String> d) {
		String[] x = d.toArray(new String[d.size()]);
		Arrays.sort(x);
		
		String longest = null;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < x.length; i++) {
			if(x[i].length() > max && subStringPresent(x[i],s)) {
				max = x[i].length();
				longest = x[i];
			}
		}
		
        return null;
    }
	
	static public boolean subStringPresent(String sub,String str) {
		int i=0;
		int j=0;
		while(i<str.length() && j<sub.length()) {
			if(sub.charAt(j) == str.charAt(i)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		if(j!=sub.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subStringPresent("apple","abcplea"));
	}

}
