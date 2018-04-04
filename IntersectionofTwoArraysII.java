import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class IntersectionofTwoArraysII {
	
//	public static int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums1.length; i++) {
//			map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
//		}
//        
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < nums2.length; i++) {
//			if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
//				list.add(nums2[i]);
//				map.put(nums2[i], map.get(nums2[i])-1);
//			}
//		}
//        
//        int[] result = new int[list.size()];
//        ListIterator<Integer> li = list.listIterator();
//        int i = 0;
//        
//        while(li.hasNext()) {
//        	result[i++] = li.next();
//        }
//        
//        return result;
//    }
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0,k=0;
		int N1 = nums1.length, N2 = nums2.length;
		int[] result = new int[N1>N2 ? N1 : N2];
		
		while(i<N1 && j<N2) {
			if(nums1[i]==nums2[j]) {
				result[k++] = nums1[i++];
				j++;
			} else if(nums1[i]>nums2[j]) {
				j++;
			} else {
				i++;
			}
		}
		return Arrays.copyOf(result, k);
    }

	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {};
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}

}
