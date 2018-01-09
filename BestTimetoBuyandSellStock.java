
public class BestTimetoBuyandSellStock {
	
	static public int maxProfit(int[] prices) {
		
		if(prices.length==0) {
			return 0;
		}
		
		
        int maxProfit = prices.length>=2 ? prices[0]-prices[1] : Integer.MIN_VALUE;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
			
        	minPrice = Math.min(minPrice, prices[i]);
        	int currentProfit = prices[i] - minPrice;
        	maxProfit = Math.max(currentProfit, maxProfit);
		}
        
        return maxProfit;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,10,6,20};
		System.out.println(maxProfit(a));

	}

}
