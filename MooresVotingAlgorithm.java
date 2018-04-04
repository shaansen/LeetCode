import java.util.Arrays;

public class MooresVotingAlgorithm {
	
	public static int findMajorityElement(int[] nums) {
		int count = 0;
		int maj_idx = 0;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.println("===========================================");
			System.out.println(nums[i]);
			System.out.println("Before Majority : "+nums[maj_idx]+"\t|\t"+maj_idx);
			System.out.println("Before Count    : "+count);
			if(nums[i] == nums[maj_idx]) {
				System.out.println("Elements Equal, Incrementing count");
				count++;
			} else {
				if(count == 0) {
					System.out.println("Switching the Major Element");
					maj_idx = i;
				} else {
					System.out.println("Elements Unequal, Decrementing count");
					count--;
				}
			}
			System.out.println("After Majority : "+nums[maj_idx]+"\t|\t"+maj_idx);
			System.out.println("After Count    : "+count);
			
		}
		
		return ifMajorityElement(nums, nums[maj_idx]) ? nums[maj_idx] : -1;
	}
	
	public static boolean ifMajorityElement(int[] nums, int element) {
		int r = (int) Math.floor(nums.length/2);
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
		if(nums[i] == element) {
				count++;
			}
			if(count > r) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int[] nums = {2,3,2,3,3};
		System.out.println(findMajorityElement(nums));

	}

}
