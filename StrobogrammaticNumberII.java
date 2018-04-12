import java.util.LinkedList;
import java.util.List;

public class StrobogrammaticNumberII {
	
	public static boolean isStrobogrammatic(char c1, char c2) {
		if(c1 == c2 && (c1 == '8' || c1 == '1' || c1 =='0')) {
        	return true;
        } else if((c1=='6' && c2=='9') || (c1=='9' && c2=='6')) {
        	return true;
        } else {
        	return false;
        }
    }
	
	public static boolean isStrobogrammatic(String num) {
		
		int i = 0;
        int j = num.length()-1;
        char[] c = num.toCharArray();
        while(i<=j) {
        	if(isStrobogrammatic(c[i],c[j])) {
        		i++;
        		j--;
        	} else {
        		return false;
        	}
        }
        return true;
    }
	
	public static boolean compareTwoStrings(String a, String b) {
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		
		int i=0;
		while(i<a.length() && Integer.parseInt(ca[i]+"") == Integer.parseInt(cb[i]+"")) {
			i++;
		}
		if((i<a.length() && Integer.parseInt(ca[i]+"") < Integer.parseInt(cb[i]+"")) || (i==a.length())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean StringNumberInRange(String a, String low, String high) {
		if(a.length()<low.length() || a.length()>high.length()) {
			return false;
		} else if(a.length() > low.length() && a.length() < high.length()) {
			return true;
		} else {
			if(a.length() == low.length() && a.length() == high.length()) {
				return compareTwoStrings(low,a) && compareTwoStrings(a,high);
			} 
			if(a.length() == low.length()) {
				return compareTwoStrings(low,a);
			} else if(a.length() == high.length()) {
				return compareTwoStrings(a,high);
			} 
			return false;
		}
	}
	
	public static int count;
	public static String lower;
	public static String higher;
	
	public static void getAllCombinations(String a, int n) {
		if(a.length() == n) {
			if(isStrobogrammatic(a) && a.charAt(0)!='0' && StringNumberInRange(a, lower, higher)) {
//				System.out.println(a);
				count++;
				
			}
			return;
		}
		
		
		getAllCombinations("0"+a+"0", n);
		getAllCombinations("1"+a+"1", n);
		getAllCombinations("6"+a+"9", n);
		getAllCombinations("9"+a+"6", n);
		getAllCombinations("8"+a+"8", n);
		
		
	}
	
	public static void findStrobogrammatic(int n) {
		if(n == 1) {
			int upperLimit = higher.length()>1 ? 9: Integer.parseInt(higher);
			for(int i=Integer.parseInt(lower);i<=upperLimit;i++) {
				if(i==0 || i==1 || i==8) {
					count++;
				}
			}
		} else {
			if(n%2 == 0) {
				getAllCombinations("", n);
			} else {
				getAllCombinations("0", n);
				getAllCombinations("1", n);
				getAllCombinations("6", n);
				getAllCombinations("8", n);
				getAllCombinations("9", n);
			}
		}
    }
	
	public static int strobogrammaticInRange(String low, String high) {
        count = 0;
        lower = low;
        higher = high;
        for (int i = low.length(); i <= high.length(); i++) {
        	findStrobogrammatic(i);
		}
        return count;
    }
	
	

	public static void main(String[] args) {
		System.out.println(strobogrammaticInRange("0", "0"));

	}

}
