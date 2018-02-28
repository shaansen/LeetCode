
public class TeemoAttacking {
	
	static public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 1) {
        	return duration;
        } else if(timeSeries.length == 0 || timeSeries == null) {
        	return 0;
        }
        
        int res = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
        	int x = timeSeries[i+1] - timeSeries[i]; 
			res += x<duration ? x : duration;
		}
        return res+duration;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] timeSeries = {1,2,3,4,5};
		int duration = 5;
		System.out.println(findPoisonedDuration(timeSeries, duration));
	}

}
