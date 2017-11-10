
public class ComplexNumberMultiplication {
	
	static public String complexNumberMultiply(String x, String y) {
		
		int index_1 = x.indexOf("+");
		int index_2 = y.indexOf("+");
		
		int a1 = Integer.parseInt(x.substring(0,index_1));
		int a2 = Integer.parseInt(x.substring(index_1+1,x.length()-1));
		
		int b1 = Integer.parseInt(y.substring(0,index_2));
		int b2 = Integer.parseInt(y.substring(index_2+1,y.length()-1));
		
		
		
		return Integer.toString(a1*b1-a2*b2)+"+"+Integer.toString(a2*b1 + a1*b2)+"i";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "20+22i";
		String b = "-18+-10i";
		System.out.println(complexNumberMultiply(a, b));
	}

}
