import java.util.*;

class First_Bad_Version {
    public int firstBadVersion(int n) {
        long left = 1;
        long right = n;
        int ans = 0;
        while (left <= right) {
            int mid = (int) (left + (right - left) / 2);
            if (isBadVersion(mid)) {
                ans = mid;
                right = mid - 1;
            } else
                left = mid + 1;
        }
        return ans;
    }
}