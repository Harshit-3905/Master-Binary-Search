import java.util.*;

class Find_Right_Interval {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (map.ceilingEntry(intervals[i][1]) != null)
                ans[i] = map.ceilingEntry(intervals[i][1]).getValue();
            else
                ans[i] = -1;
        }
        return ans;
    }
}