import java.util.*;

public class ExcelSheetColumnNumber {

	public static int titleToNumber(String s) {
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
        	map.put((char)(i+65), i+1);
		}
        
        if(s.length() == 0) {
        	return -1;
        } else if(s.length() == 1) {
        	return map.get(s.charAt(0));
        }
        
        int count = 0;
        int mult = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
        	count += map.get(s.charAt(i)) * (int)Math.pow(26, mult--);
		}
        
        return count;
    }
	
	public static void main(String[] args) {
//		System.out.println(titleToNumber("A"));
		int[] arr = new int[1];
		int[] arr2 = new int[0];
		System.out.println(Arrays.toString(arr2));

	}

}
