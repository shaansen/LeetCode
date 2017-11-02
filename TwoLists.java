import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;


public class TwoLists {

	static public String[] findRestaurant(String[] l1, String[] l2) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		LinkedList<String> list = new LinkedList<String>();
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < l2.length; i++) {
			map.put(l2[i],i);
		}
		for (int i = 0; i < l1.length; i++) {
			if(map.containsKey(l1[i]) && min > map.get(l1[i])+i) {
				list.clear();
				list.add(l1[i]);
				min = map.get(l1[i])+i;
			} else if(map.containsKey(l1[i]) && min == map.get(l1[i])+i) {
				list.add(l1[i]);
			}
		}
		
		return list.toArray(new String[list.size()]);
				
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] s2 = {"KFC", "Shogun", "Burger King"};
		System.out.println(Arrays.toString(findRestaurant(s1,s2)));
	}

}
