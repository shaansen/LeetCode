
public class MissingNumber {
	
	static public int missingNumber(int[] nums) {
		int x = 0;
		for (int i = 0; i < nums.length; i++) {
        	x ^= nums[i] ^ i;
		}
        return x^nums.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,1,3};
		System.out.println(missingNumber(x));
	}

}
