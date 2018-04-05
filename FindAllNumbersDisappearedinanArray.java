import java.util.*;

public class FindAllNumbersDisappearedinanArray {
	
	static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	System.out.println(nums[i] - 1);
			nums[nums[i] - 1] = nums[nums[i] - 1] < 0 ? nums[nums[i] - 1] : -nums[nums[i] - 1];
		}
        System.out.println(Arrays.toString(nums));
        
        return list;
    }

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

}
