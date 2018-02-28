
public class LargestNumberAtLeastTwiceofOthers {
	
	public static int dominantIndex(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int max_2 = Integer.MIN_VALUE;
		int max_index = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max_2 = max;
				max = nums[i];
				max_index = i;
			}
			if(nums[i] > max_2 && nums[i]!=max) {
				max_2 = nums[i];
			}
		}
		return max>=2*max_2 ? max_index : -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(dominantIndex(nums));

	}

}
