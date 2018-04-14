import java.util.*;

public class MergeIntervals {
	
	public static List<Interval> merge(List<Interval> intervals) {
		Integer[] start = new Integer[intervals.size()];
		Integer[] end   = new Integer[intervals.size()];
		
		ListIterator<Interval> li = intervals.listIterator();
		int idx=0;
		while(li.hasNext()) {
			Interval i = li.next();
			start[idx] = i.start;
			end[idx] = i.end;
			idx++;
		}
		
		Arrays.sort(start);
		List<Interval> result = new LinkedList<Interval>();
		for (int i = 0, j = 0; i < start.length && j < end.length; i++,j++) {
			int startTime = start[i];
			int endTime = end[j];
			while(j<end.length && i+1<start.length && endTime >= start[i+1]) {
				endTime = Math.max(endTime, end[j+1]);
				i++;
				j++;
				System.out.println(startTime+","+endTime);
				
			}
			result.add(new Interval(startTime, endTime));
		}
		
		return result;
    }

	public static void main(String[] args) {
		
		List<Interval> intervals = new LinkedList<Interval>();
		intervals.add(new Interval(1, 4));
		intervals.add(new Interval(0,0));
//		intervals.add(new Interval(8, 10));
//		intervals.add(new Interval(15, 18));
		System.out.println(merge(intervals));
	}

}
