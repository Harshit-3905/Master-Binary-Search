import java.util.*;

class Find_Minimum_in_Rotated_Sorted_Array_II {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int ans = findMin(nums);
        System.out.println(ans);
        in.close();
    }

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == nums[high] && nums[mid] == nums[low]) {
                low++;
                high--;
            } else if (nums[mid] <= nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }
}