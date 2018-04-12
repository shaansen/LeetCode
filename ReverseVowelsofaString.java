import java.util.LinkedList;
import java.util.List;

public class ReverseVowelsofaString {
	
	public static boolean isVowel(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	
	public static String reverseVowels(String s) {
		
		char[] c = s.toCharArray();
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < c.length; i++) {
			if(isVowel(c[i])) {
				list.add(i);
			}
		}
        Integer[] arr = list.toArray(new Integer[list.size()]);
        int i = 0;
        int j = arr.length-1;
        while(i<j) {
        	char temp = c[arr[j]];
        	c[arr[j]] = c[arr[i]];
        	c[arr[i]] = temp;
        	i++;
        	j--;
        }
        
        return new String(c);
    }
	
	public static void main(String[] args) {
		String s = "aAuOu";
		System.out.println(reverseVowels(s));

	}

}
