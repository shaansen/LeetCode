import java.util.Collections;
import java.util.Arrays;

public class MinMovesToEqualElements {

	public static int minMoves(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int result = 0;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j) {
					result += Math.abs(arr[i]-arr[j]);
				}
			}
			if(result >= 0) {
				min = Math.min(min, result);	
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
		System.out.println(minMoves(arr));

	}

}
