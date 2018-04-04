import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    
    Queue<Integer> queue;
    int sizeQ;
    double sum;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        sizeQ = size;
        sum = 0;
    }
    
    public double next(int val) {
    	System.out.println("---------------------------------------");
    	sum += val;
        queue.offer(val);
        if(queue.size() > sizeQ) {
        	int x = queue.poll();
            sum -= x;
        }
        
        System.out.println(sum);
        System.out.println(queue.size());
        System.out.println(sum/queue.size());
        return sum/queue.size();
    }
    
    public static void main(String[] args) {
    	 MovingAverage obj = new MovingAverage(5);
    	 double param_1 = obj.next(12009);
    	 double param_2 = obj.next(1965);
    	 double param_3 = obj.next(-940);
//    	 System.out.println(param_1);
//    	 System.out.println(param_2);
//    	 System.out.println(param_3);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
