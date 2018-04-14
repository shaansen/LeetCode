import java.util.HashSet;

public class UniqueWordAbbreviation {
    
	HashSet<String> set;
	
	public String shorten(String s) {
		return s.length() <= 1 ? s : s.charAt(0)+""+(s.length()-2)+s.charAt(s.length()-1);
	}

    public UniqueWordAbbreviation(String[] dictionary) {
        this.set = new HashSet<String>();
        for (int i = 0; i < dictionary.length; i++) {
        	set.add(shorten(dictionary[i]));
		}
    }
    
    public boolean isUnique(String word) {
    	System.out.println(this.set);
    	return !this.set.contains(shorten(word));
    }
    
    public static void main(String[] args) {
    	
    	String[] dictionary = {"hello"};
    	String word = "hello";
    	
    	UniqueWordAbbreviation obj = new UniqueWordAbbreviation(dictionary);
    	boolean param_1 = obj.isUnique(word);
    	System.out.println(word+" -> "+param_1);
    }
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */

