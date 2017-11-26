
public class CTCI1_5OneAway {
	
	public static boolean oneAway(String a1, String b1) {
		if(a1.length()-b1.length()<2 && a1.length()-b1.length()>-2) {
			String a = a1.length()<b1.length() ? a1 : b1;
			String b = a1.length()<b1.length() ? b1 : a1;
			int i=0;
			int count = a.length()==b.length() ? 0 : 1;
			boolean alreadyFoundDifference = false;
			for (int j = 0; j < a.length(); j++) {
				if(b.charAt(i)!=a.charAt(j)) {
					i += count;
					if(!alreadyFoundDifference) {
						alreadyFoundDifference = true;
					} else {
						return false;
					}
				}
				i++;
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneAway("pale", "bale"));

	}

}
