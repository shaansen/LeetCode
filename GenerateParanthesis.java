import java.util.*;

public class GenerateParanthesis {
	
	public static List<String> ans;
	
	public static List<String> generateParenthesis(int n) {
        ans = new LinkedList<String>();
        backtrack("", 0, 0, n);
        return ans;
    }

    public static void backtrack(String cur, int open, int close, int max){
    	if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max) {
        	backtrack(cur+"(", open+1, close, max);
        }
        if (close < open) {
        	backtrack(cur+")", open, close+1, max);
        }
            
    }

	public static void main(String[] args) {
		System.out.println(generateParenthesis(4));
	}

}
