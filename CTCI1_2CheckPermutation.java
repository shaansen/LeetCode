import java.util.Arrays;

public class CTCI1_2CheckPermutation {
	
	public static boolean checkPermutationMethod1(String a,String b) {
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		a = new String(c);
		b = new String(d);
		return a.equals(b);
	}
	
	public static boolean checkPermutationMethod2(String a,String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		int charSet[] = new int[128];
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			int x = a.charAt(i);
			int y = b.charAt(i);
			charSet[x]++;
			charSet[y]--;
		}
		
		for (int i = 0; i < c.length; i++) {
			if(charSet[i]!=0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPermutationMethod2("abca","cba"));
	}

}
