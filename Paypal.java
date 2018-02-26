
public class Paypal {
	
//	static long countMoves(int[] numbers) {
//        // Find the least element
//        int min = numbers[0];
//        for(int i=1;i<numbers.length;i++) {
//        	min = Math.max(min,numbers[i]);
//        }
//        
//        long result = 0;
//        for (int i = 0; i < numbers.length; i++) {
//			result += Math.abs(numbers[i]-min);
//		}
//        return result;
//    }\
	
	static int[] charArray(String a) {
		int[] res = new int[26];
		for (int i = 0; i < a.length(); i++) {
			res[a.charAt(i)-'a']++;
		}
		return res;
	}
	
	static int arrayDifference(int[] a,int[] b) {
		int res = 0;
		for (int i = 0; i < 26; i++) {
			res += Math.abs(a[i]-b[i]);
		}
		return res/2;
	}

	static int computeDifference(String a, String b) {
		if(a.length()!=b.length()) {
			return -1;
		}
		int[] a_arr = charArray(a);
		int[] b_arr = charArray(b);
		return arrayDifference(a_arr, b_arr);
	}
	
	static int[] getMinimumDifference(String[] a, String[] b) {
		int[] res = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = computeDifference(a[i],b[i]);
		}
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
