import java.util.Iterator;

public class CalculateXORfrom1ton {
	
	public static void getXOR(int n) {
		int count = 1;
		for (int i = 1; i <= n ; i++) {
			count ^= i;
			System.out.println(count);
		}
	}
	
	public static void getXOR2(int n) {
		int count = 1;
		for (int i = 1; i <= n ; i++) {
			count ^= i;
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getXOR(15);
	}

}
