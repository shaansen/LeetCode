import java.util.Arrays;

public class ShortestCompletingWord {
	
	public static int[] getCharArray(String s) {
		int[] res = new int[26];
        for(int i=0; i<s.length();i++) {
        	int idx = s.charAt(i)-'a'; 
            if(idx >= 0) {
                res[idx]++;
            }
        }
//        System.out.println(Arrays.toString(res));
        return res;
    }
	
	public static int getDiff(int[] a,int[] b) {
		int sum = 0;
		for (int i = 0; i < 26; i++) {
            if(a[i]!=0) {
                sum+=a[i]-b[i]>=0 ? a[i]-b[i] : 0;    
            }
			
		}
//        System.out.println("Sum: "+sum);
		return sum;
	}
	
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		
		int minLength = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		String result = null;
		
        int[] licenseArray = getCharArray(licensePlate.toLowerCase());
        for (int i = 0; i < words.length; i++) {
//            System.out.println("--------------------------------------------------");
//            System.out.println(words[i]);
			int[] wordArray = getCharArray(words[i]);
			int diff = getDiff(licenseArray, wordArray);
			if(diff < min || (diff == min && words[i].length() < minLength)) {
				result = words[i];
				min = diff;
				minLength = words[i].length();
			}
		}
        return result;
    }        

	public static void main(String[] args) {

		String licensePlate = "1s3 PSt";
		String[] words = {"step", "steps", "stripe", "stepple"};
		System.out.println(shortestCompletingWord(licensePlate, words));
	}

}
