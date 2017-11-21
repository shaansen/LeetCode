import java.util.*;

public class SelfDividingNumbers {
	
	static public boolean dividesAll(int x) {
		String str = Integer.toString(x);
		
		if(str.contains("0")) {
			return false;
		}
		
		str = str.replaceAll("1","");
		
		Set<String> set = new HashSet<String>();
		while(str.length()!=0) {
			String sub = Character.toString(str.charAt(0));
			set.add(sub);
			str = str.replaceAll(sub,"");	
			if(x%Integer.parseInt(sub)!=0) {
				return false;
			}
		}
		return true;	
		
	}
	
	static public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = left; i < right+1; i++) {
			if(i%10!=0 && (dividesAll(i) || i<10)) {
				list.add(i);
			}
		}
        
        return list;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(selfDividingNumbers(1,22));
	}
}
