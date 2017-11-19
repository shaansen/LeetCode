
public class DetectCapital {
	
	static public boolean detectCapitalUse(String word) {
		int count = 0;
		int i=0;
		String lowerWord = word.toLowerCase();

		for (i = word.length() - 1; i >= 0; i--) {
			count -= word.charAt(i);
			count += lowerWord.charAt(i);
		}
		if(count == word.length()*32 || count == 0 || (count == 32 && word.substring(0,1).equals(lowerWord.substring(0,1).toUpperCase()))) {
			return true;
		}
		
		return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("FlAG"));
		System.out.println(detectCapitalUse("Shantanu"));
	}

}
