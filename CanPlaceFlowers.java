
public class CanPlaceFlowers {
	
	static public boolean canPlaceFlowers(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length && count < n; i++) {
			if(a[i]==0) {
				int x = i-1<0 ? 0 : a[i-1];
				int y = i+1>=a.length ? 0 : a[i+1];
				if(x==0&&y==0) {
					a[i] = 1;
					count++;
				}
			}
		}
		return count>=n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,0,0,0,1};
		int n = 2;
		System.out.println(canPlaceFlowers(a, n));
	}

}
