
public class LicenseKeyFormatting {
	
	public static String licenseKeyFormatting(String S, int K) {
        char[] c = S.toCharArray();
        int idx = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = c.length - 1; i > -1; i--) {
			if(c[i]!='-') {
				sb.append(c[i]+"");
				if(idx%K==0) {
					sb.append("-");
				}
				idx++;
			}
		}
        String s = sb.reverse().toString().toUpperCase();
        return s.length()>0 && s.charAt(0)=='-' ? s.substring(1) : s;
    }

	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("---2-", 8));

	}

}
