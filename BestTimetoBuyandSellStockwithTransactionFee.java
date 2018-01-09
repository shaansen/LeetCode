
public class BestTimetoBuyandSellStockwithTransactionFee {
	
	public static int DP(int[] prices, int fee, int low, int high) {
		System.out.println("==============================================");
		System.out.println("Low:"+low+"\tPrice:"+prices[low]);
		System.out.println("High:"+high+"\tPrice:"+prices[high]);
		if(low==high) {
            return 0;
        } else {
            int maxProfit = prices[high]-prices[low]-fee<0?0:prices[high]-prices[low]-fee;
            for(int i=low+1;i<high;i++){
            	if(prices[i]-prices[low]-fee >= 0) {
            		int x = DP(prices,fee,i+1,high);
            		int y = prices[i]-prices[low]-fee;
                    maxProfit = Math.max(maxProfit, Math.max(x, y+x));
            	}
            }

            //System.out.println("Profit:"+maxProfit);
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
		int[] prices = new int[] {4,5,2,4,3,3,1,2,5,4};
		int fee = 1;
		System.out.println(maxProfit(prices, fee));
	}

}
