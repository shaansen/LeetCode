import java.util.HashMap;
import java.util.Map;

public class NumberofBoomerangs {
	
	public static int getDifference(int[] a,int[] b) {
		return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
	}
	
	public static int numberOfBoomerangs(int[][] points) {
		
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for (int j = 0; j < points.length; j++) {
				if(i!=j) {
					int x = getDifference(points[i], points[j]);
					map.put(x, map.getOrDefault(x, 0)+1);
				}
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getValue() > 1) {
					result += (entry.getValue()*(entry.getValue()-1));
				}
			}
		}
		
		return result;
    }

	public static void main(String[] args) {
		int[][] points = {{0,0},{1,0},{2,0},{3,0},{0,0}};
//		int[][] points = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
		System.out.println(numberOfBoomerangs(points));

	}

}
