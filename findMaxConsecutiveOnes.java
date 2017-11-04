
public class findMaxConsecutiveOnes {
	
	static public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length; i++) {
            if(nums[i] == 0) {
                count = 0;
            } else {
                count++;
                System.out.println("Incrementing to "+count);
            }
            max = Math.max(max,count);
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(x));

	}

}
