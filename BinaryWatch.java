import java.util.*;

public class BinaryWatch {
	
	public static List<String> readBinaryWatch(int num) {
		List<String> result = new LinkedList<>();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 59; j++) {
				
				int x = Integer.toBinaryString(i).length() - Integer.toBinaryString(i).replaceAll("1","").length();
				int y = Integer.toBinaryString(j).length() - Integer.toBinaryString(j).replaceAll("1","").length();
				//System.out.println(i+":"+j+" -> "+(x+y));
				if(x+y == num) {
					String min = j < 10 ? "0"+j : j+"";
					result.add(i+":"+min);
				}
			}
		}
		System.out.println(result.size());
		return result;
    }

	public static void main(String[] args) {
		System.out.println(readBinaryWatch(5));

	}

}
