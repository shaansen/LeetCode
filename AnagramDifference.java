import java.util.Arrays;

public class AnagramDifference {
	
	public static int[] getCharCount(String s) {
		int[] res = new int[26];
		for (int i = 0; i < s.length(); i++) {
			res[s.charAt(i)-'a']++;
		}
		return res;
	}
	
	public static int getDifference(int[] a,int[] b) {
		int result = 0;
		for (int i = 0; i < 26; i++) {
			result += Math.abs(a[i]-b[i]);
		}
		return result;
	}
	
	public static int removeAnagram(String s, String r) {
		int[] arr_s = getCharCount(s);
		int[] arr_r = getCharCount(r);
		int result = getDifference(arr_s,arr_r);
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(removeAnagram("abcdef", "abcdef"));

	}

}
