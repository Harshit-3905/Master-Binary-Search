import java.util.*;

class Binary_Search {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(search(nums, target));
        in.close();
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1)
            if (nums[0] == target)
                return 0;
            else
                return -1;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] > target)
                e = mid - 1;
            else if (nums[mid] < target)
                s = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}