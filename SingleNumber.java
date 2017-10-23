import java.util.Arrays;


public class SingleNumber {
	
	static public int singleNumber(int[] nums) {
        int x = 0;
		for (int i : nums) {
			x = x ^ i;
		}
		return x;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,1,2,2,3};
		System.out.println(singleNumber(x));
	}

}
