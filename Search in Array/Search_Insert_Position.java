import java.util.*;

class Search_Insert_Position {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = in.nextInt();
        int target = in.nextInt();
        System.out.println(searchInsert(nums, target));
        in.close();
    }

    public static int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target > nums[mid])
                s = mid + 1;
            else if (target < nums[mid])
                e = mid - 1;
            else
                return mid;
        }
        return s;
    }
}