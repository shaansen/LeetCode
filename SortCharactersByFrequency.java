import java.util.*;

public class SortCharactersByFrequency {
	
	public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
        		(a,b) -> b.getValue()-a.getValue()	
        );
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
        	pq.add(entry);
        }
        
        while(!pq.isEmpty()) {
        	Map.Entry<Character, Integer> temp = pq.poll();
        	for (int i = 0; i < temp.getValue(); i++) {
				sb.append(Character.toString(temp.getKey()));
			}
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(frequencySort("AabbB"));
	}

}
