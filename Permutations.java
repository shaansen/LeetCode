import java.util.*;

public class Permutations {
	
	public static List<String> result;
	
	public static void permutationHelper(String s,String combination) {
		if(s.length() == 0) {
			result.add(combination);
		}
		for (int i = 0; i < s.length(); i++) {
			permutationHelper(s.substring(0,i)+s.substring(i+1,s.length()), combination+s.charAt(i));
		}
	}
	
	public static List<String> permute(String s) {
		result = new LinkedList<>();
		permutationHelper(s,"");
		return result;
	}
	
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println(permute(s));
	}

}
