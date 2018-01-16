
public class MaximumProductSubarray {
	
	public static int prod(int[] a) {
		int res = 1;
		for (int i = 0; i < a.length; i++) {
			res *= a[i];
		}
		return res;
	}

	public static int maxProduct(int[] nums) {
        
		if(nums.length == 1) {
        	return nums[0];
        } 
        
        int i=0;
        int j=nums.length-1;
        int max = prod(nums);
        
        while(i<j) {
        	System.out.println("---------------------------------");
        	System.out.println("i:"+i+"\tj:"+j);
        	
        	if(nums[i]<nums[j] && max<max/nums[j] && max>0) {
        		max = max/nums[j];
        		j--;
        	} else if(nums[i]>nums[j] && max>max/nums[i] && max>0) {
        		max = max/nums[i];
        		i++;
        	} else if(nums[i]<nums[j] && max>max/nums[j] && max<0) {
        		max = max/nums[i];
        		j--;
        	} else if(nums[i]<nums[j] && max>max/nums[i] && max<0) {
        		max = max/nums[i];
        		i++;
        	} else {
        		i++;
        		j--;
        	}
        	System.out.println(max);
        }
        return max;
    } 
	
	public static void main(String[] args) {
		int[] a = {2,3,-2,4};
		System.out.println(maxProduct(a));
	}

}
