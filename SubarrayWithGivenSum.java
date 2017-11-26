
public class SubarrayWithGivenSum {
	
	public static void getIndexes(int[] arr,int sum) {
		int currentSum = arr[0];
		int start = 0;
		for (int i = 1; i < arr.length; i++) {
			currentSum += arr[i];
			if(currentSum>sum) {
				currentSum -= arr[start];
				start++;
			} else if(currentSum == sum) {
				System.out.println(start+" -> "+i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 15;
		getIndexes(arr, sum);
	}

}
