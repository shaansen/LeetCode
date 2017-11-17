
public class FindTheDifferenceII {

	static private char findTheDifference(String s, String t) {
		int charCount = t.charAt(t.length()-1);
		for (int i = 0; i < s.length(); i++) {
			charCount -= s.charAt(i);
			charCount += t.charAt(i);
		}
		return (char)(charCount);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd","abcde"));
	}

}
