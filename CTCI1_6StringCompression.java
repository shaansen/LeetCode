
public class CTCI1_6StringCompression {
	
	public static String getCompressedString(String str) {
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		str = str + "/";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			count++;
			if(ch[i]!=ch[i+1]) {
				sb.append(Character.toString(ch[i])+count);
				count = 0;
			}
		}
		return sb.toString().length() >= str.length() ? str.substring(0,str.length()-1) : sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCompressedString("aabbcc"));

	}

}
