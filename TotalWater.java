
public class TotalWater {
	
	public static int getArea(int[] a) {
		int left = 0;
		int right = a.length - 1;
		int leftMax = 0;
		int rightMax = a.length - 1;
		int area = 0;
		
		while(left <= right) {
			System.out.println("Left:"+left);
			System.out.println("LeftMax:"+leftMax);
			System.out.println("Right:"+right);
			System.out.println("RightMax:"+rightMax);
			if(a[left] < a[right]) {
				if(a[left] >= a[leftMax]) {
					area += Math.min(a[left],a[leftMax]) * (left - leftMax);
					leftMax = left;
				}
				left++;
			}  else {
				if(a[right] >= a[rightMax]) {
					area += Math.min(a[right],a[rightMax]) * (rightMax - right);
					rightMax = right;
				}
				right--;
			}
			System.out.println("Area : "+area);
			System.out.println("========================");
		}
		
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,3,3,2,1,2,1};
		System.out.println(getArea(a));

	}

}
