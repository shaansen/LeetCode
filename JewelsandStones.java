
public class JewelsandStones {
	
	public static int numJewelsInStones(String J, String S) {
        char[] ch = J.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
			int x = S.length() - S.replaceAll(Character.toString(ch[i]),"").length();
			count += x;
		}
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numJewelsInStones("z", "aAAbbbbb"));

	}

}
