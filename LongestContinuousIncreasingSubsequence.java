
public class LongestContinuousIncreasingSubsequence {
	
	public static int findLengthOfLCIS(int[] a) {
		if(a.length == 0) {
			return 0;
		}
        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < a.length-1; i++) {
			if(a[i+1]-a[i] > 0) {
				count++;
			} else {
				count = 1;
			}
		}
        max = Math.max(count, max);
        return max;
    }

	public static void main(String[] args) {
		int[] a = {1,3,5,4,7};
		System.out.println(findLengthOfLCIS(a));
	}

}
