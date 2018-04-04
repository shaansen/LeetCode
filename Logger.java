import java.util.LinkedHashMap;
import java.util.Map;

class Logger {
    
    public LinkedHashMap<String, Integer> map;

    /** Initialize your data structure here. */
    public Logger() {
       map  = new LinkedHashMap<String, Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(map.size() > 1000) {
            for(Map.Entry<String, Integer> entry: map.entrySet()) {
            	if(entry.getValue() < timestamp-10) {
            		map.remove(entry.getKey());
            	}
            }
        }
        
        if(!map.containsKey(message) || (timestamp - map.get(message) >= 10)) {
            map.put(message, timestamp);
            System.out.println(map);
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */