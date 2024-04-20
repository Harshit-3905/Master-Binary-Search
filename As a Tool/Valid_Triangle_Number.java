import java.util.*;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int l = j + 1, r = len - 1;
                int k = -1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (nums[i] + nums[j] > nums[mid]) {
                        k = mid;
                        l = mid + 1;
                    } else
                        r = mid - 1;
                }
                if (k != -1)
                    ans += k - j;
            }
        }
        return ans;
    }
}