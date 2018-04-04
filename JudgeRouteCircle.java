
public class JudgeRouteCircle {
	
//	public static boolean judgeCircle(String moves) {
//		int u = moves.length() - moves.replaceAll("U","").length();
//		int d = moves.length() - moves.replaceAll("D","").length();
//		int l = moves.length() - moves.replaceAll("L","").length();
//		int r = moves.length() - moves.replaceAll("R","").length();
//		
//        return u==d && l==r;
//    }
	
	
	public static boolean judgeCircle(String moves) {
		int[] result = new int[128];
		
		for (char c: moves.toCharArray()) {
			result[c]++;
		}
		return result['U']==result['D'] && result['L']==result['R'];
    }

	public static void main(String[] args) {

		System.out.println(judgeCircle("UDLR"));
		System.out.println("--------------------------------------");
		System.out.println(judgeCircle("LL"));

	}

}
