import java.util.Arrays;

public class PaintHouse {
	
//	public static int[][] memo;
//	
//	public static int DP(int[][] cost, int house, int color) {
//		
//		
//		if(house > cost.length-1 || cost.length==0) {
//			return 0;
//		}
//		if(memo[house][color+1]!=0) {
//			return memo[house][color+1];
//		}
//		if(color == 0) {
//			int x = Math.min(cost[house][1]+DP(cost,house+1,1),cost[house][2]+DP(cost,house+1,2));
//			//System.out.println("0 -> "+x);
//			memo[house][color+1] = x;
//			return x;
//		} else if(color == 1) {
//			int y = Math.min(cost[house][0]+DP(cost,house+1,0),cost[house][2]+DP(cost,house+1,2));
//			//System.out.println("1 -> "+y);
//			memo[house][color+1] = y;
//			return y;
//		} else if(color == 2){
//			int z = Math.min(cost[house][0]+DP(cost,house+1,0),cost[house][1]+DP(cost,house+1,1));
//			//System.out.println("2 -> "+z);
//			memo[house][color+1] = z;
//			return z;
//		} else {
//			int w = Math.min(cost[house][0]+DP(cost,house+1,0), Math.min(cost[house][1]+DP(cost,house+1,1),cost[house][2]+DP(cost,house+1,2)));
//			//System.out.println("-1 -> "+w);
//			memo[house][color+1] = w;
//			return w;
//		}
//	}
	
//	
//	
//	public static int minCost(int[][] costs) {
//		memo = new int[costs.length][costs[0].length+1];
//        return DP(costs,0,-1);
//    }

	
	public static int minCost(int[][] costs) {
        if(costs==null || costs.length==0) {
            return 0;
        }
		
        for(int i=1;i<costs.length;i++) {
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0],costs[i-1][1]);
        }
        
        return Math.min(costs[costs.length-1][0], Math.min(costs[costs.length-1][1], costs[costs.length-1][2]));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr = {{5,8,6},{19,14,13},{7,5,12},{14,15,17},{3,20,10}};
		int[][] arr = {{11,13,20},{13,20,12},{15,18,9},{8,1,2},{20,18,20},{5,15,11},{2,11,8},{3,20,12},{5,16,14},{11,7,9},{16,6,1},{12,9,9},{11,18,13},{16,12,17},{8,6,12},{6,5,7},{2,17,4},{5,20,1},{4,7,15},{4,16,2},{2,11,20},{5,18,14},{11,15,11},{6,6,14},{13,11,19},{2,10,16},{3,10,11}};
		
		System.out.println(minCost(arr));
	}

}
