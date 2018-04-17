
public class ValidPalindrome {
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for (int k = 0; k < s.length(); k++) {
			int idx1 = s.charAt(k)-'0';
			if((idx1>=0 && idx1<10) || (idx1>=49 && idx1<=74)) {
				sb.append(s.charAt(k));
			}
		}
			
		return sb.toString().equals(sb.reverse().toString());
    }

	public static void main(String[] args) {
		
		String s1 = "1A man, a plan, a canal: Panama1";
		String s2 = "0P";
		System.out.println(isPalindrome(s2));
	}

}
