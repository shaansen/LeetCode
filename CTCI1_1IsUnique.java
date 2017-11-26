
public class CTCI1_1IsUnique {
	
	public static boolean isUnique(String str) {
		boolean charSet[] = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			if(!charSet[x]) {
				charSet[x] = !charSet[x];
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isUniqueUsingBitVector(String str) {
		int boolBit = 0;
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			if((boolBit & (1 << x ))==0) {
				boolBit = (boolBit | (1 << x ));
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueUsingBitVector("a"));
	}

}
