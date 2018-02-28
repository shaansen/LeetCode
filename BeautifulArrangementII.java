import java.util.Arrays;

public class BeautifulArrangementII {
	
	public static  int[] constructArray(int n, int k) {
        
		int[] res = new int[n];
        
		for (int i = 0; i < n-k-1; i++) {
			res[i] = i+1;
		}
		
		int index_inc = n-k-1;
		int max_in_subarr = k+1;
		
		for (int i = 0; i < k+1; i++) {
			res[i+index_inc] = i%2==0 ? i/2 + index_inc + 1 : index_inc + (max_in_subarr--); 
		}
		
        return res;
    }

	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(constructArray(6,4)));

	}

}
