import java.util.*;

public class FlowerBed {
	
//	public static boolean validBed(int[] bed, int k) {
//		
//		int N = bed.length;
//		int count = 0;
//		boolean start = false;
//		for (int j = 0; j < N; j++) {
//			if(bed[j] == 1 && count == k) {
//				return true;
//			} else if(bed[j] == 1 && count != k) {
//				count = 0;
//				start = true;
//			} else if(bed[j] == 0 && start) {
//				count++;
//				
//			}		
//		}
//		
//		return false;
//	}
//	
//	public static int kEmptySlots(int[] flowers, int k) {
//        int N = flowers.length;
//		int[][] bed = new int[N][N];
//		int[] bedThatDay = new int[N];
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if(i==j) {
//					bedThatDay[flowers[j]-1] = 1;
//				}
//			}
//			bed[i] = bedThatDay;
////			System.out.println("Day"+(i+1)+"\t-> "+Arrays.toString(bedThatDay));
//			if(validBed(bedThatDay, k)) {
//				return i+1;
//			}
//		}
//		return -1;	
//    }
	
	public static int kEmptySlots(int[] flowers, int k) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < flowers.length; i++) {
			int flower = flowers[i];
			Integer before = set.lower(flower);
			Integer after  = set.higher(flower);
			if((before!=null && flower - before == k+1) || (after!=null && after - flower == k+1)) {
				return i+1;
			}
			set.add(flower);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] flowers = {1,3,2};
		int k = 1;
		System.out.println(kEmptySlots(flowers, k));
	}

}
