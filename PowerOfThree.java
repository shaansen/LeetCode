import java.util.HashSet;

public class PowerOfThree {
	
	static public boolean isPowerOfThree(int n) {
		HashSet<Integer> set = new HashSet<>();
		int num = 1;
		while(num > 0) {
			set.add(num);
			num *= 3;
		}
		return set.contains(n);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
