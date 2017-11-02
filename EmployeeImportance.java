import java.util.*;


public class EmployeeImportance {
	
	static public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		int count = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int x = A[i]+B[j];
				if(map1.keySet().contains(x)) {
					map1.put(x,map1.get(x)+1);
				} else {
					map1.put(x,1);
				}
			}
		}
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {
				int x = C[i]+D[j];
				if(map2.keySet().contains(x)) {
					map2.put(x,map2.get(x)+1);
				} else {
					map2.put(x,1);
				}
			}
		}
		
		return count;
    }	
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {-2,-1};
		int[] c = {-1,2};
		int[] d = {0,2};
		System.out.println(fourSumCount(a, b, c, d));
	}

}
