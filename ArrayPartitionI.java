import java.util.Arrays;


public class ArrayPartitionI {
	
	public static int arrayPairSum(int[] nums) {
		
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		int sum = 0;
		for (int i = 0; i < sorted.length; i=i+2) {
			sum += sorted[i];
		}
		
		return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,3,2};
		System.out.println(arrayPairSum(arr));
		
	}

}
