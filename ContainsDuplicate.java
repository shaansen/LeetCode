import java.util.*;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length < 2) {
			return false;
		} else if(nums.length == 2) {
			return nums[0] == nums[1];
		}
        
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			} else {
				set.add(nums[i]);
			}
		}
		return false;
    }

	public static void main(String[] args) {
		
		int[] nums = {3,3};
		System.out.println(containsDuplicate(nums));
	}

}
