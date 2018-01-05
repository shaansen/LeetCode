
public class ExcelSheetColumnTitle {

	static public String convertToTitle(int n) {
				
		String str = "";
		while(n>0) {
			n = n - 1;
			char x = (char)('A'	+ (n%26));
			str = x + str;
			n /= 26;
		}
		return str;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(28));
	}

}
