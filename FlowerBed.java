import java.util.*;

public class FlowerBed {
	
	public static int preceding(TreeSet<Integer> set, int flower){
		Integer before = set.lower(flower);
		
		while(before!=null && flower-before==1){
			 flower = before;
			 before = set.lower(flower);
		}
		return flower;
    }
    
    public static int following(TreeSet<Integer> set, int flower){
    		Integer after = set.higher(flower);
    		
    		while(after!=null && after-flower==1){
    			 flower = after;
    			 after  = set.higher(flower);
    		}
    		return flower;
    }
    
    
    public static int kEmptySlots(int[] flowers, int k) {
        
        if(flowers.length == k) {
    		return flowers.length;
    	}
    	
    	TreeSet<Integer> set = new TreeSet<>();
    	for (int i = 0; i < flowers.length; i++) {
    		set.add(flowers[i]);
    	}
    		
    	for(int i=flowers.length-1;i>-1;i--){
    		int flower = flowers[i];
    		set.remove(flower);
    		for(Integer f : set){
    			Integer higherFlower = following(set,f);
    			Integer lowerFlower  = preceding(set,f);
                if(higherFlower!=null && lowerFlower!=null && (higherFlower-lowerFlower+1)==k){
    				return i;
    			}
    		}
    	}
    	return -1;
    }

	public static void main(String[] args) {
		
	
		
		int[] flowers = {3,1,5,4,2};
		int k = 1;
		System.out.println(kEmptySlots(flowers, k));
	}

}
