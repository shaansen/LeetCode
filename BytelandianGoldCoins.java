
public class BytelandianGoldCoins {
	
	public static int getMax(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		int[] result = new int[n+1];
		for (int i = 0; i <= n; i++) {
			result[i] = (int)Math.max(n, getMax(n/2)+getMax(n/3)+getMax(n/4)); 
		}
		
		return result[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(getMax(n));
	}

}
