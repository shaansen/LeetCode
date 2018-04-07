import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NextClosestTime {
	
	public static int[] getHM(String a) {
		int[] time = new int[2];
		time[0] = Integer.parseInt(a.substring(0,2));
		time[1] = Integer.parseInt(a.substring(2,4));
		return time;
	}
	
	public static int getTimeDifference(int[] a, int[] b) {
		int x = a[0]*60+a[1];
		int y = b[0]*60+b[1];
		return y>x ? y-x : y-x+(24*60);
	}
	
	public static int getTimeDifference(String a, String b) {
		if(a.equals(b)) {
			return 24*60;
		}
		return getTimeDifference(getHM(a), getHM(b));
	}
	
	public static List getAllCombinations(String s) {
		int origHr  = Integer.parseInt(s.substring(0,2));
		int origMin = Integer.parseInt(s.substring(2,4));
		int[] a = {Integer.parseInt(s.substring(0,1)),Integer.parseInt(s.substring(1,2)),Integer.parseInt(s.substring(2,3)),Integer.parseInt(s.substring(3,4))};
		List<String> result = new LinkedList<String>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						int h = a[i]*10 + a[j];
						int m = a[k]*10 + a[l];
						if(h<24 && m<60) {
							String hr  = h < 10 ? "0"+h : h+"";
							String min = m < 10 ? "0"+m : m+"";
							result.add(hr+min);
						}
					}
				}
			}
		}
		return result;
	}
	
	public static String nextClosestTime(String time) {
        time = time.replaceAll(":","");
        List list = getAllCombinations(time);
        int min = Integer.MAX_VALUE;
        String closest = "";
        Iterator<String> i = list.iterator();
        while(i.hasNext()) {
        	String time2 = i.next();
        	int diff = getTimeDifference(time, time2);
        	if(min > diff) {
        		min = diff;
        		closest = time2;
        	}
        }
        return closest.substring(0,2)+":"+closest.substring(2,4);
    }

	public static void main(String[] args) {
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				String hr  = i<10 ? "0"+i : i+"";
				String min = j<10 ? "0"+j : j+"";
				System.out.println(nextClosestTime(hr+":"+min));
			}
		}
	}

}
