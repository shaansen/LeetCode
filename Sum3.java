import java.util.*;

public class Sum3 {
	
	static public int validSearch(Integer[] nums,int i,int j,int val) {
		if(j>=i) {
			int mid = (i + j) / 2;
			if(nums[mid] == val) {
				return nums[mid];
			} else if(nums[mid] > val) {
				return validSearch(nums,i,mid - 1,val);
			} else {
				return validSearch(nums,mid + 1,j,val);
			}
		}
		return -1;
	}	
	
	static public List<List<Integer>> threeSum(int[] a) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		
		Integer[] nums = hs.toArray(new Integer[hs.size()]);
		
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				int x = validSearch(nums, j+1, nums.length-1, -(nums[i]+nums[j]));
				if(x!=-1)
					System.out.println(nums[i]+"+"+nums[j]+"+"+x+"=0");
			}
		}
		
		return null;
    }
	
	public static void main(String[] args) {
		int nums[] = {-1, 0, 1, 2, -1, -4};
		threeSum(nums);
	}
}
