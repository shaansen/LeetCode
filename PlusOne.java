import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		
		int[] result;
		int[] extraResult = new int[digits.length+1];
		int carry = 1;
		for (int i = digits.length-1; i >= 0; i--) {
			int x = (digits[i]+carry)%10;
			int newCarry = (digits[i]+carry)/10;
			digits[i] = x;
			extraResult[i+1] = x;
			carry = newCarry;
		}
		
		if(carry == 1) {
			extraResult[0] = carry;
			result = extraResult;
		} else {
			result = digits;
		}
        return result;
    }

	public static void main(String[] args) {
		int[] x = {9,9,9};
		System.out.println(Arrays.toString(plusOne(x)));

	}

}
