
public class reverseStringIII {
	
	static public String reverseWords(String s) {
		String str[] = s.split(" ");
		String ans = "";
		for (int i = 0; i < str.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(" "+str[i]);
			ans += sb.reverse();
			
		}
		return ans.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
