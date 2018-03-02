import java.util.*;

public class LetterCombinationsofaPhoneNumber {
	
	public static List<String> result;
		
	public static void createNumber(String str, int idxReached, String digits, char[][] charArr) {
		if(str.length() == digits.length()) {
			result.add(str);
			return;
		}
		int idx = digits.charAt(idxReached) - 48;
		for (int i = 0; i < charArr[idx-2].length; i++) {
			createNumber(str+Character.toString(charArr[idx-2][i]), idxReached+1, digits, charArr);
		}
		
		
	}
	
	public static List<String> letterCombinations(String digits) {
		
		if(digits.length() == 0) {
			return null;
		}
		
		result = new LinkedList<String>();
        char[][] charArr = {{'a','b','c'},{'d','e','f'},
        		{'g','h','i'},{'j','k','l'},{'m','n','o'},
        		{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
		
		if(digits.length() == 1) {
			for(int i=0 ; i < charArr[Integer.parseInt(digits)-2].length; i++) {
				result.add(Character.toString(charArr[Integer.parseInt(digits)-2][i]));
			}
			return result;
		}
		createNumber("",0, digits, charArr);
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println(letterCombinations("2"));
	}

}
