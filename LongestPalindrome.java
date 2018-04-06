import java.util.Arrays;

public class LongestPalindrome {
	
	public static int longestPalindrome(String s) {
        int[] charCount = new int[128];
        
        for (int i = 0; i < s.toCharArray().length; i++) {
			charCount[s.charAt(i)]++;
		}
       
        boolean odd = false;
        
        int count = 0;
        for (int i = 0; i < charCount.length; i++) {
        	if(!odd && charCount[i]%2==1) {
        		odd = true;
        	}
			count += (charCount[i]/2)*2;
		}
        return odd ? count + 1 : count;
    }	

	public static void main(String[] args) {
		System.out.println(longestPalindrome("abccccddabAAZZZ"));
	}
}
