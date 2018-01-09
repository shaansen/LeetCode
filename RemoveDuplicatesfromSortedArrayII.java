import java.util.*;
public class RemoveDuplicatesfromSortedArrayII {
	
	static public int removeDuplicates(int[] nums) {
		
		int index = 0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1]) {
				nums[index++] = nums[i];
			}
		}
		nums[index++] = nums[nums.length-1];
		System.out.println(Arrays.toString(nums));
		return index;
    }
	
	public static void main(String[] args) {
		int[] x = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(x));
	}
}
