import java.util.Arrays;

public class HouseRobber {
	
	public static int[] memo;
	
	public static int sum(int[] num, int start) {
		
		
		
		if(start>=num.length) {
			return 0;
		} 
		
		if(memo[start]!=-1) {
			return memo[start];
		}
		memo[start] = Math.max(num[start]+sum(num, start+2),sum(num,start+1));
		return memo[start];
		
	}

	
	static public int rob(int[] nums) {
        return sum(nums,0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,100,100,2};
		memo = new int[a.length];
		Arrays.fill(memo, -1);
		System.out.println(rob(a));
	}

}
