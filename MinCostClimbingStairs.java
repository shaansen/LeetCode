import java.util.Arrays;

public class MinCostClimbingStairs {
	
	static int[] memo;
	
	public static int dp(int[] cost, int start) {
		if(start < cost.length) {
			if(memo[start] == -1) {
				int a = cost[start]+dp(cost,start+1);
				int b = start + 1 < cost.length ? cost[start+1]+dp(cost,start+2) : 0;
				memo[start] = Math.min(a,b);
			}
			return memo[start];
		} else {
			return 0;
		}
	}
	
	public static int minCostClimbingStairs(int[] cost) {
        dp(cost,0);
        dp(cost,1);
        return memo[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] cost = {10,15,20};
		int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		memo = new int[cost.length];
		for (int i = 0; i < cost.length; i++) {
			memo[i] = -1;
		}
		
		System.out.println(minCostClimbingStairs(cost));
	}

}
