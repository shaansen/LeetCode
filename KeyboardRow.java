import java.util.*;

public class KeyboardRow {
	
	static public boolean checkThisWord(String s,String[] setA) {
		
		String a = s;
		for (int i = 0;i < setA.length; i++) {
			a = a.replaceAll(setA[i],"");
			if(a.length()==0) {
				return true;
			}
		}
		return false;
		
	}
	
	
	static public String[] findWords(String[] wordsCap) {
		
		String[] words = wordsCap.clone();
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			String[] setA = {"q","w","e","r","t","y","u","i","o","p"};
			String[] setB = {"a","s","d","f","g","h","j","k","l"};
			String[] setC = {"z","x","c","v","b","n","m"};
			
			if(checkThisWord(words[i],setA) || checkThisWord(words[i],setB) || checkThisWord(words[i],setC)) {
				list.push(wordsCap[i]);
			}
		}
		
        return list.toArray(new String[list.size()]);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(Arrays.toString(findWords(a)));
	}

}
