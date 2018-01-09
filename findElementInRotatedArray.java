
public class findElementInRotatedArray {
	
	public static int binarySearch(int[] a,int low,int high,int key){
		//System.out.println("Low:"+low+"\tHigh:"+high);
		if(low<high) {
			int mid = (low + high)/2;
			if(a[mid]==key) {
				return mid;
			} else if(a[low]<a[mid] && a[low] <= key && key <= a[mid]) {
				return binarySearch(a, low, mid, key);
			} else if(a[mid]<a[high] && a[mid] <= key && key <= a[high]) {
				return binarySearch(a, mid+1, high, key);
			} else if(a[low]>a[mid] || a[mid]>a[high]) {
				return binarySearch(a, low, mid, key) + binarySearch(a, mid+1, high, key);
			} else {
				return 0;
			}
		} else if(low == high && a[low]==key) {
			return low;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" - "+binarySearch(a,0, a.length-1,a[i]));
		}
	}

}
