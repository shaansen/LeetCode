
public class SearchinRotatedSortedArray {
	
	public static int getPivotIndex(int[] a) {
		int low = 0;
		int high = a.length-1;
		while(low < high && a[low]>a[high]) {
			int mid = low + (high - low)/2;
			if(low == mid) {
				return low+1;
			}
			if(a[low] > a[mid] && a[mid] < a[high]) {
				high = mid;
			} else if(a[low] < a[mid] && a[mid] > a[high]) {
				low = mid;
			}
		}
		return low;
	}
	
	public static int binarySearch(int[] a, int target, int left, int right) {
			if(a[left] == target) {
				return left;
			} else if(a[right] == target) {
				return right;
			} else if(left==right && a[left]!=target) {
				return -1;
			}
			int mid = left + (right - left)/2;
			
			if(a[mid] == target) {
				return mid;
			} else if(target < a[mid]) {
				return binarySearch(a, target, left, mid);
			} else if(target > a[mid]) {
				return binarySearch(a, target, mid+1, right);
			} else {
				return -1;
			}

	}
	
	public static int search(int[] a, int target) {
		int pivot = getPivotIndex(a);
		if(pivot-1 >=0 && a[0] <= target && target <= a[pivot-1]) {
			return binarySearch(a, target, 0, pivot-1); 
		} else if(pivot < a.length && a[pivot] <= target && target <= a[a.length-1]) {
			return binarySearch(a, target, pivot, a.length-1);
		} else {
			return -1;
		}
    } 

	public static void main(String[] args) {
		int[] a = {1,3};
		System.out.println(search(a,2));
		
	}
}
