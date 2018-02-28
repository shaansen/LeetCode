import java.util.*;
import java.util.Map.Entry;

class Sortbyname implements Comparator<Map.Entry<Integer, Integer>>
{
    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue()-o2.getValue();
	}
}

public class TopKFrequentElements {
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
		
		List<Integer> list = new LinkedList<Integer>();
        
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Entry<Integer, Integer>>(
                (a,b) -> a.getValue()-b.getValue()
       );
        
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	if(pq.contains(entry)) {
        		list.add(entry.getKey());
        	}
        }
        
        return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		System.out.println(topKFrequent(nums, k));
	}

}
