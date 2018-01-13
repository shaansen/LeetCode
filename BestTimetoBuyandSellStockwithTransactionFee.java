import java.util.Iterator;

public class BestTimetoBuyandSellStockwithTransactionFee {
	
	public static int maxProfit(int[] prices, int fee) {
        long t_ik0 = 0, t_ik1 = Integer.MIN_VALUE;
        
        for (int price : prices) {
        	long t_old = t_ik0;
        	System.out.println(price);
        	System.out.println("Before:\t"+t_ik0+"\t"+t_ik1);
        	t_ik0 = Math.max(t_ik0, t_ik1 + price - fee);
        	t_ik1 = Math.max(t_ik1, t_old - price);
        	System.out.println("After:\t"+t_ik0+"\t"+t_ik1);
		}
        return (int)t_ik0;
    }
	
	public static int maxProfit1(int[] prices, int fee) {
	    long T_ik0 = 0, T_ik1 = Integer.MIN_VALUE;
	    
	    for (int price : prices) {
	        long T_ik0_old = T_ik0;
	        System.out.println(price);
	        System.out.println("Before:\t"+T_ik0+"\t"+T_ik1);
	        T_ik0 = Math.max(T_ik0, T_ik1 + price - fee);
	        T_ik1 = Math.max(T_ik1, T_ik0_old - price);
	        System.out.println("After:\t"+T_ik0+"\t"+T_ik1);
	    }
	        
	    return (int)T_ik0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = new int[] {1,3,2,8,4,9};
//		int[] prices = new int[] {4,5,2,4,3,3,1,2,5,4};
		int fee = 2;
		System.out.println(maxProfit(prices, fee));
		System.out.println("-------------------------------------");
		System.out.println(maxProfit1(prices, fee));
	}

}
