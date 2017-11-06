
public class RemoveElement {
	
	static public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
        return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {3,2,2,3};
		int y = 3;
		System.out.println(removeElement(x,y));
	}

}
