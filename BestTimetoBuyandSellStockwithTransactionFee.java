
public class BestTimetoBuyandSellStockwithTransactionFee {
	
	public static int DP(int[] prices, int fee, int low, int high) {
        if(low==high) {
            return 0;
        } else if(low+1==high && prices[low]>prices[high]) {
        	return 0;
        } else if(low+1==high && prices[low]<prices[high]) {
        	return (-fee-prices[low]+prices[high]);
        } else {
            int maxProfit = 0;
            for(int i=low+1;i<high;i++){
            	maxProfit = Math.max(maxProfit, prices[i]-prices[low]-2+DP(prices,fee,i+1,high));
            }
            return maxProfit;
        }
        
    }
    
    
    public static int maxProfit(int[] prices, int fee) {
        
        int i = 0;
        int maxProfit = 0;
        
        while(i<prices.length-1 && prices[i+1]<prices[i]) {
            i++;
        }
        return DP(prices,fee,i,prices.length-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] prices = new int[] {1,3,2,8,4,9};
		int[] prices = new int[] {1,3,7,5,10,3};
		int fee = 3;
		System.out.println(maxProfit(prices, fee));
	}

}
