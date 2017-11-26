import java.util.*;

public class RansomNote {
	
	static public HashMap<Character, Integer> getMap(String ransomNote) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		int n = ransomNote.length();
		while(n!=0) {
			String str = Character.toString(ransomNote.charAt(0));
			ransomNote = ransomNote.replaceAll(str,"");
			int count = n - ransomNote.length();
			map1.put(ransomNote.charAt(0), count);
			n = ransomNote.length();	
			System.out.println(ransomNote);
		}
		return map1;
	}
	
	static public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map1 = getMap(ransomNote);
		HashMap<Character, Integer> map2 = getMap(magazine);
		System.out.println(map1);
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("aa","ab"));
	}

}
