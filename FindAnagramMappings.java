import java.util.Arrays;
import java.util.HashMap;

public class FindAnagramMappings {
	
	static public int[] anagramMappings(int[] A, int[] B) {
        
		int[] result = new int[A.length];
		
		int[] map = new int[100000];
		
		for (int i = 0; i < A.length; i++) {
			map[A[i]] = i;
		}
		for (int i = 0; i < B.length; i++) {
			System.out.println(i+"\t->\t"+B[i]+"\t->\t"+map[B[i]]);
			result[i] = map[B[i]];
		}
		return result;
    }

	public static void main(String[] args) {
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
//		int[] A = {21,5,74,5,74,21};
//		int[] B = {21,5,74,74,5,21};
		System.out.println(Arrays.toString(anagramMappings(A, B)));

	}

}
