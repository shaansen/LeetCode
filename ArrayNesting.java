import java.util.*;

public class ArrayNesting {
	
	public static HashSet<Integer> completeSet;
	
	public static int findLength(int[] arr, int start) {
		HashSet<Integer> localSet = new HashSet<Integer>();
		int idx = start;
		while(!localSet.contains(idx)) {
			localSet.add(idx);
			completeSet.add(idx);
			idx = arr[idx];
		}
		return localSet.size();
	}
	
	public static int arrayNesting(int[] nums) {
		completeSet = new HashSet<Integer>();
		if(nums.length == 0 || nums == null) {
			return 0;
		} else if(nums.length == 1) {
			return 1;
		}
		
        int length = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
			if(!completeSet.contains(i)) {
				length = Math.max(length, findLength(nums, i));
			}
		}
        return length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2};
		System.out.println(arrayNesting(nums));
	}

}
