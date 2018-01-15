
public class LongestPalindromeString {
	
	public static String longString(String s, int idx) {
		//System.out.println("======================"+idx+"==========================");
        int i1=idx-1;
        int j1=idx+1;
        while(i1>=0 && j1<=s.length()-1) {
            if(s.charAt(i1)==s.charAt(j1)) {
            	
            	i1--;
                j1++;
                
            } else {
                break;
            }
        }
        //System.out.println(i1+"/"+j1);
        String s1 = s.substring(i1+1,j1);
        
        //System.out.println("First:\t"+s1);
        //System.out.println("---------------------------------------------");
        int i2=idx-1;
        int j2=idx;
        while(i2>=0 && j2<=s.length()-1) {
            if(s.charAt(i2)==s.charAt(j2)) {
            	i2--;
                j2++;
            } else {
                break;
            }
        }
        
        //System.out.println(i2+"/"+j2);
        String s2 = s.substring(i2+1,j2);
        //System.out.println("Second:\t"+s2);
        return s1.length() > s2.length() ? s1 : s2;
        
    } 
    
    public static String longestPalindrome(String s) {
        if(s==null || s.length()==0) {
            return "";
        } else if(s.length()==1) {
            return s;
        }
        
        int max = Integer.MIN_VALUE;
        String maxString = s;
        
        for (int i = 1; i < s.length(); i++) {
        	String temp = longString(s, i);
			if(temp.length() > max) {
				max = temp.length();
				maxString = temp;
			}
		}
        return maxString;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abba"));

	}

}
