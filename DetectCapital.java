import java.util.Arrays;

public class DetectCapital {
	
//	static public boolean detectCapitalUse(String word) {
//		int count = 0;
//		int i=0;
//		String lowerWord = word.toLowerCase();
//
//		for (i = word.length() - 1; i >= 0; i--) {
//			count -= word.charAt(i);
//			count += lowerWord.charAt(i);
//		}
//		if(count == word.length()*32 || count == 0 || (count == 32 && word.substring(0,1).equals(lowerWord.substring(0,1).toUpperCase()))) {
//			return true;
//		}
//		
//		return false;
//    }
	
	static public boolean detectCapitalUse(String word) {
		if(word == null || word.length() == 0) {
			return false;
		}
		char[] ch = word.toLowerCase().toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		return word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) || (word.length()>1 && word.equals(new String(ch)));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("U"));
		System.out.println(detectCapitalUse("FlAG"));
		System.out.println(detectCapitalUse("Shantanu"));
	}

}
