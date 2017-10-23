import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


public class NextGreaterElementI {
	
	static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[nums1.length];
		
		for (Integer i : nums2) {
			while(!stack.isEmpty() && stack.peek() < i) {
				map.put(stack.pop(),i);
			}
			stack.push(i);
		}
		for (int i = 0; i < result.length; i++) 
		{
			result[i] = map.getOrDefault(nums1[i],-1);
		}
		
		return result;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {4,1,2};
		int[] y = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(x,y)));

	}

}
