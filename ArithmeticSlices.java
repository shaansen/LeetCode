import java.util.Arrays;
import java.util.HashMap;

public class ArithmeticSlices {
	
	static public int numberOfArithmeticSlices(int[] A) {
        Arrays.sort(A);
        int[] d = new int[A.length-1];
        for (int i = 0; i < A.length - 1; i++) {
        	d[i] = A[i+1]-A[i];
		}
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        int max = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
        
        for (int i = 0; i < d.length-1; i++) {
        	if(!map.containsKey(d[i])) {
        		map.put(d[i],0);
        	}        	
        	
			if(d[i]==d[i+1]) {
				map.put(d[i],map.get(d[i])+1);
				max = Math.max(max,map.get(d[i]));
			} else {
				map.put(d[i], 0);
			}
		}
        
        System.out.println(max);
        
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		System.out.println(numberOfArithmeticSlices(A));
	}

}
