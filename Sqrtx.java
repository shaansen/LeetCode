
public class Sqrtx {
	
	public static int mySqrt(int x) {
		return (int)Math.pow(10,Math.log10(x)*0.5);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2147395600;
		System.out.println(mySqrt(x));

	}

}
