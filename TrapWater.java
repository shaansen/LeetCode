
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
	
	public static int trap(int[] a) {
        int left = 0;
        int right = 0;
        int water = 0;
        int i = 0;
        int j = a.length-1;
        
        while(i<j) {
            if(a[i]<a[j]) {
                left= Math.max(left,a[i]);
                System.out.println("LEFT : "+left);
                System.out.println(i+" : "+a[i]);
                System.out.println("WATER "+(left-a[i]));
                water += (left-a[i]);
                i++;
            } else {
                right= Math.max(right,a[j]);
                System.out.println("RIGHT : "+right);
                System.out.println(j+" : "+a[j]);
                System.out.println("WATER "+(left-a[i]));
                water += (right-a[j]);
                j--;
            }
        }       
        
        return water;
    }

	public static void main(String[] args) {
		int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(a));
	}

}
