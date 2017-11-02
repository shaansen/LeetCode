import java.util.*;

public class SetMismatch {
	
	static public int[] findErrorNums(int[] nums) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		int x = 0;
		int y = 0;
		for (int i = 0; i < nums.length; i++) {
			if(!set.contains(nums[i])) {
				set.add(nums[i]);
			} else {
				x = nums[i];
			}
		}
		
		for (int i = 1; i <= nums.length; i++) {
			if(!set.contains(i)) {
				y = i;
				break;
			}
		}
		
		int[] result = new int[2];
		result[0] = x;
		result[1] = y; 
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,5,3,2,2,7,6,4,8,9};
		System.out.println(Arrays.toString(findErrorNums(x)));

	}
}
