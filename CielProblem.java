import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CielProblem {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int result = (x-y+1)%10==0 ? x-y-1 : x-y+1; 
		System.out.println(result);
				
		
		
	}

}
