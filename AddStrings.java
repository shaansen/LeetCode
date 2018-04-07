
public class AddStrings {
	
//	public static String addStrings(String num1, String num2) {
//		String x = num1.length()<num2.length() ? num2 : num1;
//		String y = num1.length()<num2.length() ? num1 : num2;
//		return handler(x,y, 0);
//    }
//
//	public static String handler(String num1, String num2,int carry) {
//		
//		if(num1.length()==0 && num2.length()==0 && carry==0) {
//			return "";
//		}else if(num1.length()==0 && num2.length()==0 && carry==1) {
//			return "1";
//		}
//		
//		int x;
//		int y;
//		String w;
//		String z;
//		
//		if(num1.length()==1) {
//			x = Integer.parseInt(num1);
//			w = "";
//		} else if(num1.length()==0) {
//			x = 0;
//			w = "";
//		} else {
//			x = Integer.parseInt(num1.substring(num1.length()-1, num1.length()));
//			w = num1.substring(0,num1.length()-1);
//		}
//		
//		if(num2.length()==1) {
//			y = Integer.parseInt(num2);
//			z = "";
//		} else if(num2.length()==0) {
//			y = 0;
//			z = "";
//		} else {
//			y = Integer.parseInt(num2.substring(num2.length()-1, num2.length()));
//			z = num2.substring(0,num2.length()-1);
//		}
//		
//		int sum = (x+y+carry)%10;
//		int ncarry = (x+y+carry)/10;
//		return handler(w, z, ncarry)+Integer.toString(sum);
//	}
	
	public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.insert(0,(x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		
		System.out.println(addStrings("1","99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));

	}

}
