import java.util.Arrays;
import java.util.HashSet;

public class MaximumProductofThreeNumbers {
	
	public  static int maximumProduct(int[] a) {
		Arrays.sort(a);
		int n = a.length-1;
		return Math.max(a[0]*a[1]*a[n], a[n]*a[n-1]*a[n-2]);
    }

	public static void main(String[] args) {
		int[] nums1 = {-100,2,3,0,	400};
		int[] nums2 = {-100,-2,3,0,400};
		int[] nums3 = {-100,-2,-3,0,400};
		System.out.println(maximumProduct(nums1));
		System.out.println(maximumProduct(nums2));
		System.out.println(maximumProduct(nums3));

	}

}
