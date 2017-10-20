import java.io.*;
import java.util.*;

public class CleaningUp {
	
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int c = 0;
			String a1 = "";
			String a2 = "";
			
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 1; j <= k; j++) {
				set.add(sc.nextInt());
			}			
			for (int j = 1; j <= n; j++) {
				if(!set.contains(j)) {
					if(c==0) {
						c = 1;
						a1 += j + " ";
					} else {
						c = 0;
						a2 += j + " ";
					}
				}
			}
			System.out.println(a1);
			System.out.println(a2);
			
		}
	}
}
