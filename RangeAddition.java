public class RangeAddition {
	
	public static int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        
        for (int i = 0; i < updates.length; i++) {
        	result[updates[i][0]] += updates[i][2];
        	if(updates[i][1]+1<length) {
        		result[updates[i][1]+1] -= updates[i][2];
        	}
        }
        
        int x = 0;
        for (int i = 0; i < result.length; i++) {
        	x += result[i];
        	result[i] = x;
		}
        
        return result;
       
    }

}
