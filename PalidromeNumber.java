
public class PalidromeNumber {
	
public static boolean isPalindrome(int x) {
		
        if(x==0)
            return true;
		if(x<0 || x%10==0)
			return false;
        
		
		int reverseNumber = 0;
		int originalNumber = x;
		
		while(originalNumber > reverseNumber) {

			int var1 = originalNumber % 10;
			originalNumber = originalNumber / 10;
			reverseNumber = reverseNumber*10 + var1;
		}
		System.out.println(originalNumber+" - "+reverseNumber);
		if(originalNumber==reverseNumber || originalNumber==reverseNumber/10) {
			return true;
		}
		
		
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(100));
	}

}
