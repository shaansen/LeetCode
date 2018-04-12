import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

class PhoneDirectory {
	
	PriorityQueue<Integer> avail;
	
    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    public PhoneDirectory(int maxNumbers) {
        avail = new PriorityQueue<Integer>();
        for (int i = 0; i < maxNumbers; i++) {
			avail.offer(i);
		}
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        if(avail.size() == 0) {
        	return -1;
        }
        return avail.poll();
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        return avail.contains(number);
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
    	if(!avail.contains(number))
    		avail.offer(number);
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */