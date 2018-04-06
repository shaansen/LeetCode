public class ReverseStringII {
	
	public static String rev(String s,int k,boolean spin) {
		if(s=="") {
			return "";
		}
		String temp1 = s.length() < k ? s : s.substring(0,k);
		String temp2 = s.length() < k ? "" : s.substring(k,s.length());
		if(spin) {
			temp1 = new StringBuilder(temp1).reverse().toString();
		}
		return temp1+rev(temp2, k, !spin);
	}
	
	public static String reverseStr(String s, int k) {
		return rev(s, k, true);
    }

	public static void main(String[] args) {
		String s = "ab";
		int k = 3;
		System.out.println(reverseStr(s, k));
	}

}
