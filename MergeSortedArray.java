import java.util.Arrays;
import java.util.Stack;

public class MergeSortedArray {
	static public void merge(int[] nums1, int m, int[] nums2, int n) {
		Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        int j = 0;
		while(i<m && j<n) {
			if(nums1[i]<=nums2[j]) {
				stack.push(nums1[i]);
				i++;
			} else {
				stack.push(nums2[j]);
				j++;
			}
        }
		while(i<m) {
			stack.push(nums1[i]);
			i++;
		}
		while(j<n) {
			stack.push(nums2[j]);
			j++;
		}
		
		i = m+n-1;
		while(!stack.isEmpty()) {
			nums1[i--] = stack.pop();
		}
		
		
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,3,5,0,0,0};
		int[] nums2 = {2,4,6};
		int m = 3;
		int n = nums2.length;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
}
