
public class FindtheDifference {
	
	static private char findTheDifference(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			t  = t.replaceFirst(Character.toString(s.charAt(i)),"");
		}
		return t.charAt(0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd","abcde"));
	}

}
