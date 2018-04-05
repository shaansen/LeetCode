import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
	
	static public String[] findRelativeRanks(int[] nums) {
		
		if(nums.length == 0)
			return new String[0];
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
        int[] copy = nums.clone();
        Arrays.sort(nums);
        
        int rank = 4;
        for (int i = nums.length-4; i >= 0; i--) {
			map.put(nums[i], Integer.toString(rank++));
		}
        map.put(nums[nums.length-1], "Gold Medal");
        if(nums.length >= 2)
        	map.put(nums[nums.length-2], "Silver Medal");
        if(nums.length >= 3)
        map.put(nums[nums.length-3], "Bronze Medal");
        
        String[] result = new String[nums.length];
        for (int i = 0; i < copy.length; i++) {
			result[i] = map.get(copy[i]);
		}
        return result;
        
    }

	public static void main(String[] args) {
		int[] nums = {4};
		System.out.println(Arrays.toString(findRelativeRanks(nums)));
	}

}
