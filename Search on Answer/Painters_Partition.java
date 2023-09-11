import java.util.*;

class Painters_Partition {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Solution(arr, k));
        in.close();
    }

    static int Solution(int arr[], int k) {
        int low = 0, high = 0;
        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int c = 1;
            int curr = 0;
            for (int x : arr) {
                curr += x;
                if (curr > mid) {
                    c++;
                    curr = x;
                }
            }
            if (c > k)
                low = mid + 1;
            else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}