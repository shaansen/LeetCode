import java.util.*;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        int r = (int)Math.floor(n/2);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			if(map.get(nums[i]) > r) {
				return nums[i];
			}
		}
        return -1;
    }
	
	public static List<Integer> majorityElementII(int[] nums) {
        int n = nums.length;
        int r = (int)Math.floor(n/3);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			if(map.get(nums[i]) > r && !list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}
        return list;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3,1,2,3,3,3,3};
		System.out.println(majorityElementII(nums));

	}

}
