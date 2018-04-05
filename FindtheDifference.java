
public class FindtheDifference {
	
	static private char findTheDifference(String s, String t) {
		char[] ch = (s+t).toCharArray();
		char x = ' ';
		for (int i = 0; i < ch.length; i++) {
			x = (char) (x ^ ch[i]);
		}
		return Character.toLowerCase(x);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcdef","abcde"));
	}

}
