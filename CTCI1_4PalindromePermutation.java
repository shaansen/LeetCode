
public class CTCI1_4PalindromePermutation {
	
	public static boolean palindromPermutation(String str) {
		int oddCounter = 0;
		int charCount[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			charCount[x]++;
			if(charCount[x]%2==1) {
				oddCounter++;
				} else 
				{
					oddCounter--;
				}
		}
		return oddCounter < 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromPermutation("abbccd"));

	}

}
