
public class PowerOfTwo {
	
	public boolean isPowerOfTwo(int n) {
		return n > 0 && 1073741824%n == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while(num>0) {
			num *= 2;
			System.out.println(num);
		}
				
	}

}
