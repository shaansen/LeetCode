
public class AddBinary {
	
	public static String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=a.length()-1,j=b.length()-1; i>=0 && j >=0; i--,j--) {
        	System.out.println();
            sb.append(a.charAt(i)^b.charAt(j)^carry);
            carry = (a.charAt(i)^b.charAt(j)^carry)%2;
        }
        return sb.reverse().toString();
    }
	
	public static void main(String[] args) {
		System.out.println(addBinary("10", "11"));

	}

}
