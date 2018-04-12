
public class StrobogrammaticNumber {
	
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
		
		if(num.contains("2") || num.contains("3") || num.contains("4") || num.contains("5") || num.contains("7")) {
			return false;
		}
		
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
	
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			if(isStrobogrammatic(i+"")) {
				System.out.println(i);
			}
		}
	}

}
