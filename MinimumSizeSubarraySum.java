import java.util.HashMap;
import java.util.Map;

public class MinimumSizeSubarraySum {
	

	public static int minSubArrayLen(int s, int[] nums)
	{
	    int n = nums.length;
	    int ans = Integer.MAX_VALUE;
	    int left = 0;
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
	        sum += nums[i];
	        System.out.println("Sum : "+sum);
	        while (sum >= s && left<nums.length-1) {
	            ans = Math.min(ans, i + 1 - left);
	            System.out.println("Since the value surpasses : Use the limits");
	            sum -= nums[left++];
	            System.out.println("Increment Left pointer");
	            
	        }
	    }
	    return (ans != Integer.MAX_VALUE) ? ans : 0;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, nums));
	}

}
