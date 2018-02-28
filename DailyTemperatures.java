import java.util.Arrays;
import java.util.HashMap;

public class DailyTemperatures {
	
	static public int[] dailyTemperatures(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length-1; i++) {
			int count = i+1;
			while(count<a.length && a[i]>a[count]) {
				count++;
			}
			res[i] = count==a.length ? 0 : count - i;
		}
        res[res.length-1]=0;
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(Arrays.toString(dailyTemperatures(a)));

	}

}
