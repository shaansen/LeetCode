import java.util.*;

public class MeetingRooms {
	
	public boolean canAttendMeetings(Interval[] intervals) {
        TreeMap<Integer, Integer> times = new TreeMap<Integer, Integer>();
        for (int i = 0; i < intervals.length; i++) {
			times.put(intervals[i].start, intervals[i].end);
		}
        int endTime = 0;
        for(Map.Entry<Integer, Integer> entry: times.entrySet()) {
        	if(entry.getKey() > endTime) {
        		endTime = entry.getValue();
        	} else {
        		return false;
        	}
        }
        return true;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
