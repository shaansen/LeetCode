import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerlandRadioTransmitters {

	public static int hackerlandRadioTransmitters(int[] x, int k) {
		//System.out.println("Entering function");
        int result = 0;
        Arrays.sort(x);
        int j=1;
        int i=0;
        int count = 0;
        //System.out.println(Arrays.toString(x)+" -> "+x.length);
        while(i<x.length) {
        	if(j<x.length && x[i]+k>=x[j]) {
            	j++;
            } else {
            	count++;
                j--;
                //System.out.println("Found center at :"+x[j]);
                int h = j+1;
                while(j<x.length && h<x.length && (x[j]+k)>=x[h]) {
                    h++;
                }
                
                i = h;
                j = i+1;
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int[] x = new int[n];
//        for(int x_i = 0; x_i < n; x_i++){
//            x[x_i] = in.nextInt();
//        }
        
        int[] y = {1,2,3,4,5};
        int k1 = 1;
        int result = hackerlandRadioTransmitters(y, k1);
        System.out.println(result);
//        in.close();
    }

}
