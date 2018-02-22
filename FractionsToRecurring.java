import java.util.*;

public class FractionsToRecurring {
	
	public static String createRecurr(int num, int den) {
		StringBuilder sb = new StringBuilder();
		int rem = num%den;
		
		
		if(rem != 0) {
			HashSet<Integer> set = new HashSet<Integer>();
			sb.append(".");
			int r = rem;
			while(r!=0) {
				if(set.contains(r)) {
					sb.insert(1,"(");
					sb.append(")");
					break;
				} else {
					set.add(r);
					r *= 10;
					String temp = Integer.toString(r/den);
					sb.append(temp);
					r %= den;
				}
			}
		}
		
		sb.insert(0,Integer.toString(num/den));
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(createRecurr(1, 33));

	}

}
