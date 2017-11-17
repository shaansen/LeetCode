import java.util.Arrays;

public class SumitsHappiness {
	
	static int[][] memo;
	
	public static int makeSumitHappy(int[] a,int start,int end) {
		
		if(memo[start][end] == -1) {
			if(start>end) {
				return 0;
			}
			if(start==end-1) {
				return a[start];
			}
			
			int y = sumArray(a, start, end);
			int mid = (start + end )/2;
			
			int z = makeSumitHappy(a, start, mid) + makeSumitHappy(a, mid, end);
			y = Math.max(y,z);
			
			memo[start][end] = y;
		}
		return memo[start][end];
	}
	
	public static int sumArray(int[] x,int start, int end) {
		int total = 0;
		for (int i = start; i < end; i++) {
			total += x[i];
		}
		return total*(end-start);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,-1,2,-2};
		memo = new int[a.length+1][a.length+1];
		for (int i = 0; i < a.length+1; i++) {
			for (int j = 0; j < a.length+1; j++) {
				memo[i][j] = -1;
			}
		}
		System.out.println(makeSumitHappy(a, 0, a.length));
	}

}
