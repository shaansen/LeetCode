import java.util.Arrays;
import java.util.LinkedList;

public class SmallestPairDistance {
	
	static public int smallestDistancePair(int[] nums, int k) {
		
		Arrays.sort(nums);
		int[] x = new int[nums.length-1];
		
		for (int i = 0; i < nums.length-1; i++) {
				x[i] = (int)Math.abs(nums[i]-nums[i+1]);
		}
		
		Arrays.sort(x);
        return x[k-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,1};
		int k = 2;
		System.out.println(smallestDistancePair(nums, k));

	}

}
