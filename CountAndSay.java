public class CountAndSay {
	
	public static String understand(String s) {
		char[] c = s.toCharArray();
		int count;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			count=1;
			while(i+1<c.length && c[i]==c[i+1]) {
				count++;
				i++;
			}
			sb.append(count+""+c[i]);
		}
		return sb.toString();
	}

	public static String countAndSay(int N) {
        int n = N - 1;
		String s = "1";
		for (int i = 1; i < n+1; i++) {
			s = understand(s);
		}
		return s;
		
    }
    
    public static void main(String[] args) {
    	System.out.println(Integer.MAX_VALUE);
    	System.out.println(countAndSay(Integer.MAX_VALUE));
    }
}