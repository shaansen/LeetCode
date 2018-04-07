
public class LicenseKey {
	
	
	static public String solution(String S, int K) {
        S = S.toUpperCase().replaceAll("-","");
        String result = "";
        int count = 0;
        for (int i = S.length(); i > 0; i--) {
			count++;
			result += S.substring(i-1,i);
			if(count == K) {
				result += "-";
				count = 0;
			}
		}
        result = new StringBuilder(result).reverse().toString();
        return result.charAt(0)=='-' ? result.substring(1) : result;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("0123kasdasdbjbdsaas", 5));
	}
}
