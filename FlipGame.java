import java.util.*;

public class FlipGame {
	
	public static List<String> generatePossibleNextMoves(String s) {
		List<String> result = new LinkedList<String>();
        if(!s.contains("++")) {
        	return result;
        }
        
        for (int i = 0; i < s.toCharArray().length-1; i++) {
			if(s.substring(i,i+2).equals("++")) {
				result.add(s.substring(0,i)+"--"+s.substring(i+2,s.length()));
			}
		}
        return result;
    }

	public static void main(String[] args) {
		System.out.println(generatePossibleNextMoves("+++"));
	}

}
