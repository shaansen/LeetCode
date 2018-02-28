import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class FourSumII {
	
	static public int binSearch(int[] b, int l, int r, int key) {
		
		if(l<r) {
			int mid = (l+r)/2;
			if(b[mid] == key) {
				return mid;
			} else if(b[mid] > key) {
				return binSearch(b, l, mid, key);
			} else {
				return binSearch(b, mid+1, r, key);
			}
		}
		return -1;
	}
	
	static public int bin(int a, int[] b) {
		return binSearch(b, 0, b.length, a);
	}
	
	static public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				map1.put(A[i]+B[j],map1.getOrDefault(A[i]+B[j],0)+1);
				map2.put(C[i]+D[j],map2.getOrDefault(C[i]+D[j],0)+1);
			}
		}
		int count = 0;
		System.out.println(map1);
		System.out.println(map2);
		
		for(Entry<Integer, Integer> entry1: map1.entrySet()) {
			if(map2.keySet().contains(entry1.getKey()*-1)) {
				int x = -1*entry1.getValue();
				System.out.println(x);
				count+= (entry1.getValue())*(map2.get(-1*entry1.getKey()));
			}
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1,-1};
		int[] B = {-1,1};
		int[] C = {-1,1};
		int[] D = {1,-1};
		System.out.println(fourSumCount(A, B, C, D));

	}

}
