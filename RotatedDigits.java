import java.util.Arrays;

public class RotatedDigits {
	
	public static int[] memo;
	
	public static int differentNumber(int n) {
		
		if(memo[n]!=-1) {
			return memo[n];
		}
		else if(Integer.toString(n).contains("3") || Integer.toString(n).contains("4") || Integer.toString(n).contains("7")) {
			memo[n] = 0;
		} else if(n==2 || n==5 || n == 6 || n == 9) {
			memo[n] = 1;
		} else if(n <= 10) {
			memo[n] = 0;
		} else {
			memo[n] = differentNumber(n%10) + differentNumber(n/10);
		}
		return memo[n];
	}
	
	public static int rotatedDigits(int N) {
		 memo = new int[N+1];
		 Arrays.fill(memo, -1);
		 int count = 0;
		 for (int i = 1; i <= N; i++) {
			if(differentNumber(i) > 0) 
				count++;
		}
		return count;
    }

	public static void main(String[] args) {
		System.out.println(rotatedDigits(100));

	}

}
