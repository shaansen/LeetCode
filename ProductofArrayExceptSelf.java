import java.util.Arrays;

public class ProductofArrayExceptSelf {
	
	static public int[] productExceptSelf(int[] a) {
        int[] r = new int[a.length];
        r[0] = 1;
        for (int i = 1; i < r.length; i++) {
			r[i] = r[i-1] * a[i-1];
		}
        int x = 1;
        for (int i = r.length-2; i >= 0; i--) {
        	x *= a[i+1];
			r[i] *= x;
		}
        return r;
    }

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		productExceptSelf(a);
	}
}
