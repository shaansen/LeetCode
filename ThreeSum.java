import java.util.*;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		
        for (int k = 0; k < nums.length-2; k++) {
        	int i = k+1, j = nums.length-1;
			while(i<j) {
				if(nums[i]+nums[j]==-nums[k]) {
					list.add(Arrays.asList(nums[k],nums[i],nums[j]));
					while(i<j && nums[i]==nums[i+1]) 
						i++;
					while(i<j && nums[j]==nums[j-1]) 
						j--;
					i++;
					j--;
				} else if(nums[i]+nums[j] > -nums[k]) {
					j--;
				} else {
					i++;
				} 
	        	while(k<nums.length-3 && nums[k]==nums[k+1]) {
	        		k++;
	        	}
			}
		}
        
        return list;
    }
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,4};
		System.out.println(threeSum(nums));
	}

}
