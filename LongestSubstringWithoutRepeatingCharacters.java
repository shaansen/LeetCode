import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	
	static public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=1;
        map.put(s.charAt(0),0);
        for (int k = 1; k < s.length(); k++) {
        	System.out.println("-----------------------------------------");
        	System.out.println(k+"|"+s.charAt(k));
			if(!map.containsKey(s.charAt(k))) {
				System.out.println("Adding this to map");
				j=k;
				System.out.println("Updated Values of i & j are "+i+"/"+j);
				map.put(s.charAt(k), k);
			} else {
				System.out.println("This is a repeating character");
				
				
				i=Math.max(i,map.get(s.charAt(k))+1);
				map.put(s.charAt(k), k);
				j=k;
				System.out.println("New Values of i & j are "+i+"/"+j);
			}
			max = Math.max(max, j-i+1);
			System.out.println("Max so far is "+max);
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("owxudnwsgsvufdsrwkrtahzvjkvoudikbiefvaxduuyax"));

	}

}
