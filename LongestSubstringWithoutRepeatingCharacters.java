import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	
	static public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = Integer.MIN_VALUE;
        int i=0;
        for(Character c:s.toCharArray()) {
        	if(!map.containsKey(c)) {
        		map.put(c,i);
        	} else {
        		max = Math.max(max,i-map.get(c));
        		map.put(c,i);
        	}
        	i++;
        	System.out.println(map);
        }
        return max==Integer.MIN_VALUE ? s.length() : max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("aab"));

	}

}
