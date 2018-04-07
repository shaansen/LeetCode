import java.util.*;
public class closestTime{
	
    public static int minDiff = Integer.MAX_VALUE;
    public static int min_hour = 23;
    public static int min_min = 59;

	public static void permute(List<Integer> arr, int k, List<Integer> original){
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k+1, original);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            int hour = arr.get(0)*10 + arr.get(1);
            int min = arr.get(2)*10 + arr.get(3);
            StringBuilder sb = new StringBuilder();
            sb = sb.append(Integer.toString(hour)).append(":").append(Integer.toString(min));
           
            if(isValid(hour,min)){

                int original_hour = original.get(0)*10 + original.get(1);
                int original_min = original.get(2)*10 + original.get(3);
                int original_time = original_hour * 60 + original_min;
                int example_time = hour * 60 + min;
                int diff = 0;
                if(example_time < original_time){
                    diff = (24*60 - original_time) + example_time;
                }else{
                    diff = example_time - original_time;
                }
                if(diff < minDiff && diff != 0){
                   
                    minDiff = diff;
                    min_hour = hour;
                    min_min = min;
                }
            } 
        }
    }

    public static boolean isValid(int hour, int min){
        if(hour < 24 && min < 60)
            return true;
        return false;
    } 
    public static String findNext(String time) {
        String[] val = time.split(":");
        List<Integer> set = new ArrayList<Integer>();
        for(String x: val){
            int t = Integer.parseInt(x);
            set.add(t / 10);
            set.add(t % 10);    
        }
        List<Integer> newList = new ArrayList<>(set);
        min_hour = set.get(0)*10 + set.get(1);
        min_min = set.get(2)*10 + set.get(3);
        permute(set, 0, newList);
        StringBuilder  hi = new StringBuilder();
        if(min_hour < 10 ){
            hi.append("0");
        }
        hi.append(min_hour).append(":");    
        if(min_min < 10 ){
            hi.append("0");
        }
        hi.append(min_min);
        return hi.toString();
    }

    public static void main(String[] args) {
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				String hr  = i<10 ? "0"+i : i+"";
				String min = j<10 ? "0"+j : j+"";
				System.out.println((hr+":"+min));
			}
		}
	}
}