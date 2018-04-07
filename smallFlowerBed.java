import java.util.*;

public class smallFlowerBed{

public static int kSizeSlots(int[] flowers, int k) {
	
	TreeSet<Integer> set = new TreeSet<>();
	int result = -1;
	
	for (int i = 0; i < flowers.length; i++) {
		set.add(flowers[i]);
	}
		
	if(flowers.length == k) {
		return flowers.length;
	}
		
	for(int i = flowers.length -1;i >=0;i--){
		int flower = flowers[i];
		set.remove(flower);
		
		for(Integer f : set){
			int lowerFlower  = preceding(set,f);
			int higherFlower = following(set,f);
			if((higherFlower-lowerFlower+1) == k){
				result = i;
				return result;
			}
		}
	}
	return result;
}

public static int preceding(TreeSet<Integer> set, int flower){
		Integer before = set.lower(flower);
		
		while(before!=null && flower-before== 1){
			 flower  = before;
			 before = set.lower(flower);
		}
		return flower;
}

public static int following(TreeSet<Integer> set, int flower){
		Integer after = set.higher(flower);
		
		while(after!=null && after-flower == 1){
			 flower  = after;
			 after = set.higher(flower);
		}
		return flower;
}
public static void main(String[] args){
		int[] intArray = new int[]{ 3,1,5,4,2 }; 
		System.out.println(kSizeSlots(intArray,5));
	}
}
