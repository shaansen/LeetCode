import java.util.Arrays; 

public class MedianofTwoSortedArrays {
	
	public static double singleArrayMedian(int[] a) {
		int N = a.length;
		if(N%2 == 0) {
			return 0.5*(a[N/2] + a[N/2 - 1]);
		} 
		return a[N/2];
	}
	public static double findMedianSortedArrays(int[] a, int[] b) {
		
		int i1 = 0, i2 = 0, i = 0;
		int N1 = a.length, N2 = b.length;
		int sum = N1+N2;
		
		if(N1 == 0)
			return singleArrayMedian(b);
		if(N2 == 0)
			return singleArrayMedian(a);
		
		int size = sum%2==0? sum/2 + 1 : (sum+1)/2;
		int[] result = new int[size];
		while(i<size && i1<N1 && i2<N2) {
			if(a[i1]<b[i2]) {
				result[i++] = a[i1];
				i1++;
			} else if(a[i1]>=b[i2]) {
				result[i++] = b[i2];
				i2++;
			}
		}
		while(i<size && i1==N1 && i2<N2) {
			result[i++] = b[i2++];
		}
		while(i<size && i1<N1 && i2==N2) {
			result[i++] = a[i1++];
		}
		System.out.println(Arrays.toString(result));
		
		return sum%2==0 ? (result[size-1]+result[size-2])*0.5 : result[size-1];
		
    }

	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {1};
		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

}
