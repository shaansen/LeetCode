import java.util.*;

public class CountingBits {
	
	public static int[] x;
	
	static public int[] countBits(int num) {
		
		x = new int[num+1];
				
		for (int i = 0; i <= num; i++) {
			x[i] = whatsTheCount(i);
		}
        
		return x;
    }
	
	public static int whatsTheCount(int num) {
		if(num==0) {
			return 0;
		} else if(num==1 || (Math.log(num)/Math.log(2)%1==0.0)) {
			return 1;
		} else {
			return 1+x[num-(int)(Math.pow(2,(int)(Math.log(num)/Math.log(2))))];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(countBits(5)));
	}

}
