import java.util.*;
import java.io.*;

public class codejam1 {
	
	public static String answer(int D, String str) {
		String result = "";
		int currentDamage = damage(str);
		if(currentDamage <= D) {
			return 0+"";
		}
		
		int count = 0;
		while(str.contains("CS")) {
			str = str.replaceFirst("CS","SC");
			currentDamage = damage(str);
			count++;
			if(currentDamage <= D) {
				return count+"";
			}
		}
		
		return "IMPOSSIBLE";
	}
	
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    
    for (int i = 1; i <= T; i++) {
      int D = in.nextInt();
      String str = in.nextLine();
      String answer = answer(D, str);
      System.out.println("Case #" + i + ": " + answer);
    }
  }

  public static int damage(String str){
  	int myDamage = 0;
  	int charge = 1;

  	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='C') {
			charge = 2*charge;
		} 
		if(str.charAt(i)=='S') {
			myDamage += charge;
		} 
	}
  	
    return myDamage;
  }
}