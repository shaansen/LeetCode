import java.util.Arrays;

public class findElement {
	
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;
	
	public static void BSearch(int[] nums, int left, int right, int x) {
		
		if(nums[left] > x) {
			return;
		}
		if(nums[right] < x) {
			return;
		}
		
		if(left<=right) {
			
			int mid = left + (right - left)/2;
			if(nums[mid] == x) {
				min = Math.min(min, mid);
				max = Math.max(max, mid);
			} 
			BSearch(nums, left, mid-1, x);
			BSearch(nums, mid+1, right, x);
		}
	} 
	
	public static int handler(int[] nums, int element) {
		BSearch(nums, 0, nums.length-1, element);
		if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE)
			return -1;
		return max-min+1;
	}

	public static void main(String[] args) {
		int[] nums = {1,1, 2, 2, 3, 3, 3, 3, 3, 3, 5, 6, 7};
		System.out.println(handler(nums, 3));


	}

}
