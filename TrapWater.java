
public class TrapWater {
	
	public static int maxArea(int[] a) {
		int n = a.length;
		int i = 0;
		int j = n-1;
		int leftMax = 0;
		int rightMax = 0;
		int ans = 0;
		
		while(i<j) {
			if(a[i] < a[j]) {
				if(a[i] > leftMax) {
					leftMax = a[i];
				} else {
					ans += (leftMax - a[i]);
				}
				i++;
			} else {
				if(a[j] > rightMax) {
					rightMax = a[j];
				} else {
					ans += (rightMax - a[j]);
				}
				j--;
			}
		}
		return ans;
	} 

	public static void main(String[] args) {
		int[] a = {5,0,5};
		System.out.println(maxArea(a));
	}

}
