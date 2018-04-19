import java.util.*;

public class Subsets {
	
	public static List<List<Integer>> subsets(int[] nums) {
        int x = nums.length;
        int y = (int) Math.pow(2,x);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        for (int i = 0; i < y; i++) {
        	List<Integer> subList = new LinkedList<Integer>();
			for (int j = 0; j < x; j++) {
				if((i & (1<<j)) != 0) {
					subList.add(nums[j]);
				}
			}
			list.add(subList);
		}
        return list;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
}
