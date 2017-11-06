
public class singleNonDuplicate {
	
	public int singleNonDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            count ^= nums[i];
            //System.out.println(count);
        }      
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
