import java.util.*;

public class GroupAnagrams {
	
	static public String getNumber(String s) {
		char[] x = s.toCharArray();
		char[] res = new char[26];
		int j=0;
		for(char i: x) {
			res[(int)i-'a']++;
		}
		
		return new String(res);
	}
	
	static public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(String str: strs) {
			String x = getNumber(str);
			if(map.keySet().contains(x)) {
				ArrayList<String> temp = map.get(x);
				temp.add(str);
				map.put(x,temp);
			} else {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(str);
				map.put(x,temp);
			}
		}
		
		ArrayList<List<String>> result = new ArrayList<List<String>>();
//		for(Map.Entry<String, ArrayList<String>> x : map.entrySet()) {
//			result.add(x.getValue());
//		}
		result.addAll(map.values());
		
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(str));
	}

}
