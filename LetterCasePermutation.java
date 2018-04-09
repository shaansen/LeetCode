import java.util.*;

public class LetterCasePermutation {
	
	public static List<String> list;
	
	public static void handler(String str, String rem) {
		int idx = 0;
		while(rem.length()>0 && Character.isDigit(rem.charAt(0))) {
			idx++;
		}
		handler(str+rem.substring(0,idx), rem.substring(idx));
		if(rem.length()==0) {
			if(!list.contains(str)) {
				list.add(str);
			}
			return;
		}
		handler(str+rem.substring(0,1).toLowerCase(), rem.substring(1));
		handler(str+rem.substring(0,1).toUpperCase(), rem.substring(1));
		
	}
	
	public static List<String> letterCasePermutation(String S) {
        list = new LinkedList<String>();
        handler("",S);
        return list;
    }

	public static void main(String[] args) {
		System.out.println(letterCasePermutation("1a2b3"));

	}

}
