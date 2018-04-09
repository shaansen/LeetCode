import java.util.HashMap;
import java.util.HashSet;

public class FractiontoRecurringDecimal {

	static public String fractionToDecimal(int n, int d) {
		Long numerator = (long) n;
		Long denominator = (long) d;
		if(numerator%denominator==0) {
			return numerator/denominator+"";
		}
		
		String before = numerator<0 ^ denominator<0 ? "-" : "";
		numerator = numerator < 0 ? -1*numerator : numerator;
		denominator = denominator < 0 ? -1*denominator : denominator;
		before += (numerator/denominator+".");
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		
		long rem = numerator%denominator;
		String answer="";
		int idx = 0;
		rem = rem*10;
		
		while(!map.containsKey(rem)) {
			map.put(rem, idx++);
			answer+=rem/denominator;
			rem = rem%denominator;
			System.out.println("Answer : "+answer);
			if(rem == 0) {
				return before+answer;
			}
			rem = rem * 10;
		}
		answer = answer.substring(0, map.get(rem))+"("+answer.substring(map.get(rem));
		answer += ")";
		return before+answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fractionToDecimal(1,Integer.MAX_VALUE));
		

	}

}
