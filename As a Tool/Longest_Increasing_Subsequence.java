import java.util.*;

class Longest_Increasing_Subsequence {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(lengthOfLIS(arr));
        in.close();
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        List<Integer> seq = new ArrayList<>();
        seq.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > seq.get(seq.size() - 1)) {
                seq.add(nums[i]);
            } else {
                int idx = binarySearch(seq, nums[i]);
                seq.set(idx, nums[i]);
            }
        }
        return seq.size();
    }

    public static int binarySearch(List<Integer> seq, int target) {
        int start = 0;
        int end = seq.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (seq.get(mid) == target) {
                return mid;
            } else if (seq.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}