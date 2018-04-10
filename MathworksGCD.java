
public class MathworksGCD {
	
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}
	}
	
	public static int gcdHandler(int a, int b) {
		if(a==b) {
			return a;
		}
		int A = a > b ? a : b;
		int B = a > b ? b : a;
		return gcd(A, B);
	}

	public static void main(String[] args) {

	}

}
