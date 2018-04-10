
public class LongestContinuousIncreasingSubsequence {
	
	public static int findLengthOfLCIS(int[] a) {
        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < a.length-1; i++) {
			if(a[i+1]-a[i] > 0) {
				count++;
			} else {
				max = Math.max(count, max);
				count = 1;
			}
		}
        max = Math.max(count, max);
        return a.length==0 ? 0 : max;
    }

	public static void main(String[] args) {
		int[] a = {2,3,1,1,4,5,6,7,8,9,8,1,2,3,4,5,6,7,8,9};
		System.out.println(findLengthOfLCIS(a));
	}

}
