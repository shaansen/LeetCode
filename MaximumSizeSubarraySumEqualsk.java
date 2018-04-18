import java.util.*;

public class MaximumSizeSubarraySumEqualsk {
	
	public static int maxSubArrayLen(int[] nums, int s) {
	    int sum = 0;
	    int max = Integer.MIN_VALUE;
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    for (int i = 0; i < nums.length; i++) {
	    	sum+=nums[i];
	    	if(sum==s) {
	    		max = Math.max(max, i+1);
	    	} else if(map.containsKey(sum-s)) {
	    		max = Math.max(max, i-map.get(sum-s));
	    	}
	    	if(!map.containsKey(sum)) {
	    		map.put(sum, i);
	    	}
	    }
	    return max == Integer.MIN_VALUE ? 0 : max;
	    
	}

	public static void main(String[] args) {
		int[] nums = {-2,-1,2,1};
		System.out.println(maxSubArrayLen(nums, 1));

	}

}
