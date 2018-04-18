import java.util.Arrays;

public class ValidNumber {
	
	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i)-'0';
			if(idx<0 || idx>9) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNumber(String s) {
		
		s = s.trim();
		if(s.length() == 0) {
			return false;
		}
		
		if(s.charAt(0)=='-') {
			s = s.substring(1);
		}
		boolean hasOneDecimal = s.indexOf(".")==s.lastIndexOf(".");
		boolean hasOneExponent = s.indexOf("e")==s.lastIndexOf("e");
		
		if(hasOneDecimal && hasOneExponent) {
			if(s.indexOf(".")!=-1 && s.indexOf("e")!=-1) {
				if(s.indexOf("e")-s.indexOf(".")<=1) {
					System.out.println("1.e");
					return false;
				}
				return (s.substring(0,s.indexOf(".")).length()>0) && check(s.substring(0,s.indexOf("."))) && check(s.substring(s.indexOf(".")+1,s.indexOf("e"))) && check(s.substring(s.indexOf("e")+1));
			} else if(s.indexOf(".")!=-1 && s.indexOf("e")==-1) {
				return check(s.substring(0,s.indexOf("."))) && check(s.substring(s.indexOf(".")+1));
			} else if(s.indexOf(".")==-1 && s.indexOf("e")!=-1) {
				return check(s.substring(0,s.indexOf("e"))) && check(s.substring(s.indexOf("e")+1));
			} else {
				return check(s);
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(isNumber("132e	"));

	}

}
