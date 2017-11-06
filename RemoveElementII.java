
public class RemoveElementII {
	
	static public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        
        if(nums.length==0)
        	return 0;
        			
        while(i < n) {
        	if(nums[i] == val) {
        		nums[i] = nums[n - 1];
        		n--;
        	} else {
        		i++;
        	}
        }
        
        return n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {2};
		int y = 3;
		System.out.println(removeElement(x,y));
	}

}
