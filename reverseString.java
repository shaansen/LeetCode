
public class reverseString {
	
	static public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
