import java.util.HashMap;

public class PalindromeChallenge {
	
	public static boolean canBeRearranged(String str) {
		int n = str.length();
		while(str.length()!=0) {
			str = str.replaceAll(Character.toString(str.charAt(0)),"");
			if((n-str.length())%2!=0) {
				return false;
			} else {
				n = str.length();
			}
		}
		return true;
	}

	public static int getPalindromeLength(String str) {
		int n = str.length()%2==0 ? str.length() : str.length() - 1;
		
		for (int i = n; i >= 0; i-=2) {
			for (int j = 0; j+i <= str.length(); j++) {
				if(canBeRearranged(str.substring(j,j+i))) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPalindromeLength("1234345"));
		System.out.println(getPalindromeLength("1234545"));

	}

}
