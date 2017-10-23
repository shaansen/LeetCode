import java.util.HashSet;

public class findDuplicate {
	
	static public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if(set.contains(i)) {
				return i;
			} else {
				set.add(i);
			}
		}
		return nums[nums.length-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,2,3};
		System.out.println(findDuplicate(x));
	}

}
