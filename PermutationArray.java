import java.util.*;

public class PermutationArray {
	
	public static List<List<Integer>> list;
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void permuteSubfunction(List<List<Integer>> list, int[] nums, int start) {
		if(start >= nums.length) {
			List<Integer> subList = new LinkedList<>();
			for (int i = 0; i < nums.length; i++) {
				subList.add(nums[i]);
			}
			list.add(subList);
			return;
		}
		
		for (int i = start; i < nums.length; i++) {
			swap(nums,start,i);
			permuteSubfunction(list, nums, start+1);
			swap(nums,start,i);
		}
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		list = new LinkedList<List<Integer>>();
		permuteSubfunction(list, nums, 0);
		return list;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		System.out.println(permute(nums));

	}

}
