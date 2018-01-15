import java.math.BigInteger;

public class ValidSquare {
	
	public static long binary(long num,long i,long j) {
//		System.out.println("============================================");
        if(i<j) {
            long mid = i + (j-i)/2;
            long x = mid*mid;
//            System.out.println(mid+"\t"+x);
            if(x == num) {
//            	System.out.println("Found it at : "+mid);
                return mid;
            } else if(x>num) {
//                System.out.println("Search lower half :"+i+"\t"+mid);
                return binary(num,i,mid);
            } else {
//                System.out.println("Search upper half"+mid+"\t"+j);
                return binary(num,mid+1,j);
            }
        }
//        System.out.println("Out of Bounds : "+i+"\t"+j);
        return -1;
    }
    
    public static long isPerfectSquare(int n) {
        
        if(n>2147395600) {
            return -1;
        } else if(n == 2147395600){
            return 46340;
        }
        return binary(n,0,46340);
    }
    
    public static long p(int n) {
    	int x = (int)Math.sqrt(n);
    	return x*x==n ? x : -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			if(p(i)!=isPerfectSquare(i)) {
				System.out.println(i+" : "+p(i)+"\t"+isPerfectSquare(i));
				
			} else {
				//System.out.println("Matches : "+i);
			}
		}
		//System.out.println(isPerfectSquare(64516));

	}

}
