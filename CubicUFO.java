import java.util.*;
import java.io.*;

public class CubicUFO {
	
	public static float[][] findRotation(int A) {
		return null;
	}
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= T; i++) {
      int N = in.nextInt();
      float[][] result = findRotation(N);
      System.out.println("Case #"+i);
      for (int j = 0; j < 3; j++) {
		System.out.println(result[j][0]+" "+result[j][1]+" "+result[j][2]);
      }
    }
  }  
}