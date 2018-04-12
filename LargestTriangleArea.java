import java.util.Arrays;

public class LargestTriangleArea {
	
	public static double area(double s, double a, double b, double c) {
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public static double side(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	public static double largestTriangleArea(int[][] a) {
        Double max = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					double A = side(a[i][0],a[i][1],a[j][0],a[j][1]);
					double B = side(a[i][0],a[i][1],a[k][0],a[k][1]);
					double C = side(a[j][0],a[j][1],a[k][0],a[k][1]);
					double S = (A+B+C)/2;
					double AREA = area(S, A, B, C);
					if(!Double.isNaN(AREA)) {
						max = Math.max(max, AREA);
					}
					
				}
			}
		}
        return max;
    }

	public static void main(String[] args) {
		//int[][] points = {{-35,19},{40,19},{27,-20},{35,-3},{44,20},{22,-21},{35,33},{-19,42},{11,47},{11,37}};
		int[][] points = {{35,-23},{-12,-48},{-34,-40},{21,-25},{-35,-44},{24,1},{16,-9},{41,4},{-36,-49},{42,-49},{-37,-20},{-35,11},{-2,-36},{18,21},{18,8},{-24,14},{-23,-11},{-8,44},{-19,-3},{0,-10},{-21,-4},{23,18},{20,11},{-42,24},{6,-19}};
		System.out.println(largestTriangleArea(points));
		

	}

}
