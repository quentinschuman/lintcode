/**
* @project_name leetcode
* @author quent
* @date 2018年8月20日
* @time 下午1:21:57
*/
package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author quent
 *
 */
public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        int insertPosition = 0;
//        result = intervals;
//		if (intervals==null) {
//			intervals.add(newInterval);
//		}
//		if (newInterval==null) {
//			return intervals;
//		}
        if(intervals == null || newInterval == null)
            return null;
        for (Interval interval:intervals) {
			if (interval.end<newInterval.start) {
				result.add(newInterval);
				insertPosition++;
			}else if (interval.end>newInterval.start) {
				result.add(newInterval);
			}else {
				newInterval.start = Math.min(newInterval.start, interval.start);
                newInterval.end= Math.max(newInterval.end, interval.end);
			}
		}
        result.add(insertPosition, newInterval);

        return result;
    }
	public static void main(String[] args) {
		InsertInterval insertInterval = new InsertInterval();
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(5, 9));
		Interval newInterval = new Interval(2, 5);
		System.out.println(intervals.get(0).end);
		System.out.println(newInterval.start);
		System.out.println(intervals.get(0).end==newInterval.start);
		System.out.println("intervals.size()"+intervals.size());
		System.out.println(insertInterval.insert(intervals, newInterval).toArray());
	}
}
