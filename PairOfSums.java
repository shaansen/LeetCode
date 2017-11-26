import java.util.Arrays;

public class PairOfSums {
	
	public static boolean pairOfSumsExist(int[] arr,int sum) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			System.out.println(i+" "+j);
			if(arr[i]+arr[j]==sum) {
				return true;
			} else if(arr[i]+arr[j]>sum) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,9};
		int[] a = {1,2,4,4};
		int sum = 8;
		System.out.println(pairOfSumsExist(a, sum));

	}

}
