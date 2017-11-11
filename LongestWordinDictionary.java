import java.util.*; 

public class LongestWordinDictionary {
	
	public static String longestWord(String[] words) {
		Arrays.sort(words);
		int max = Integer.MIN_VALUE;
		String longest = null;
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()==1 || set.contains(words[i].substring(0,words[i].length()-1))) {
				set.add(words[i]);
				if(max < words[i].length()) {
					max = words[i].length();
					longest = words[i];
					
				}
			}
		}
		
		return longest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = {"ogz","eyj","e","ey","hmn","v","hm","ogznkb","ogzn","hmnm","eyjuo","vuq","ogznk","og","eyjuoi","d"};
		System.out.println(longestWord(x));
	}

}
