import java.util.ArrayList;

public class CTCI1_3URLify {
	
	public static String URLify(String str,int size) {
		char[] ch = str.toCharArray();
		StringBuilder list = new StringBuilder();
		char[] newCh = new char[size*4];
		int i=0;
		for (int j = 0; j < ch.length; j++) {
			if(ch[j]==' ') {
				list.append('%');
				list.append('2');
				list.append('0');
			} else {
				list.append(ch[j]);
			}
		}
		
		return list.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(URLify("Mr John Smith",13));
	}

}
