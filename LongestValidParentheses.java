import java.util.*;

public class LongestValidParentheses {
	
	static public int longestValidParentheses(String s) {
        Stack<String> stack = new Stack<String>();
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
         	
			if(s.charAt(i)=='(') {
				stack.push("x");
			}
			else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
			count++;
			System.out.println(count);
			
			if(count%2 == 0 && stack.isEmpty() && (i+1==s.length() || s.charAt(i+1)==')')){
				max = Math.max(max, count);
				count = 0;
				i++;
			}			
			
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses("(()"));

	}

}
