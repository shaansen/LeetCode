import java.util.*;
public class RemoveDuplicatesfromSortedArrayII {
	
	static public int removeDuplicates(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int j = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			// if doesnt contain
			if(!map.keySet().contains(nums[i])) {
				list.add(nums[i]);
				map.put(nums[i],1);
				count++;
				nums[j] = nums[i];
				j++;
			} else if(map.get(nums[i])==1) {
				list.add(nums[i]);
				map.put(nums[i],2);
				count++;
				nums[j] = nums[i];
				j++;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		int[] x = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(x));
	}
}
