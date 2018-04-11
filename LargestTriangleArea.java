import java.util.Arrays;

public class LargestTriangleArea {
	
	public static double area(double[] x, double[] y)
    {
		double side1=0, side2=0,side3=0;
		double side1x  = x[0];
        double side1y  = y[0];
        double side2x  = x[1];
        double side2y  = y[1];
        double side3x  = x[2];
        double side3y  = y[2];

        //find length of sides of triangle
        side1 = Math.pow(Math.pow((side2x - side1x), 2) + Math.pow((side2y - side1y), 2),0.5);
        side2 = Math.pow(Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2),0.5);
        side3 = Math.pow(Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2),0.5);
        
        double s = (side1 + side2 + side3) / 2;
        double z = s * (s - side1) * (s - side2) * (s-side3);
        System.out.println(z);
        double area = Math.sqrt(z);
        
        return area;
    }
	
	public static double largestTriangleArea(int[][] points) {
		Double max = Double.MIN_VALUE;
		double[] X = new double[3];
		double[] Y = new double[3];
        for (int i = 0; i < points.length; i++) {
			for (int j = i+1; j < points.length; j++) {
				for (int k = j+1; k < points.length; k++) {
					X[0] = points[i][0];
					X[1] = points[j][0];
					X[2] = points[k][0];
					
					Y[0] = points[i][1];
					Y[1] = points[j][1];
					Y[2] = points[k][1];
					
					double area = 0.5*area(X,Y);
					max = Double.max(max, area);
				}
			}
		}
        return max;
    }

	public static void main(String[] args) {
		int[][] points = {{-35,19},{40,19},{27,-20},{35,-3},{44,20},{22,-21},{35,33},{-19,42},{11,47},{11,37}};
		System.out.println(largestTriangleArea(points));
		

	}

}
