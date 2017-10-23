import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;


public class FirstMissingPositive {
	
	static public int firstMissingPositive(int[] nums) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				list.add(nums[i]);
			}
		}
		System.out.println(list);
		ListIterator<Integer> li = list.listIterator();
		int x = 0;
		for (int i = 1; i < list.size()+1; i++) {
			x ^= li.next() ^ i;
		}
		
		return x ^ list.size()+1;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,0};
		System.out.println(firstMissingPositive(x));
	}

}
