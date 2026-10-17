/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(e -> e.start));
        int s = intervals.size();
        if(s<=1) return true;
        for(int i=0;i<s-1;i++) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i+1);
            if(i2.start<i1.end) return false;
        }
        return true;
    }
}
