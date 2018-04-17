import java.util.*;

public class RemoveInvalidParentheses {
    static List<String> result;
	static int maxLen;
	static Map<String, Boolean> map;
	
	public static boolean isValid(String s) {
		int count=0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='(') {
				count++;
			} else if(c[i]==')' && count>0) {
				count--;
			} else if(c[i]==')' && count<=0) {
				return false;
			}
		}
		
		return count==0;
	}
	
	public static void findInvalid(String s) {
		map.put(s, true);
		if(isValid(s) && !result.contains(s)) {
			if(s.length() > maxLen) {
				result = new LinkedList<String>();
				maxLen = s.length();
				result.add(s);
				
			} else if(s.length() == maxLen) {
				result.add(s);
			}
			
			return;
		} else if(isValid(s) && result.contains(s)) {
			return;
		} 
		
		for (int i = 0; i < s.length() && s.length()>maxLen; i++) {
			String subString = s.substring(0,i)+s.substring(i+1,s.length()); 
			if(!map.containsKey(subString) || (map.containsKey(subString) && !map.get(subString))) {
				findInvalid(subString);
			}
		}
	}
	
	public static List<String> removeInvalidParentheses(String s) {
		result = new LinkedList<String>();
		map = new HashMap<String, Boolean>();
		maxLen = Integer.MIN_VALUE;
		findInvalid(s);
		return result;
    }
	
	public static void main(String s[]) {
		System.out.println(removeInvalidParentheses("()((c))()())(m)))()("));
		System.out.println(removeInvalidParentheses("))(p(((())"));
		System.out.println(removeInvalidParentheses(""));
	} 
}