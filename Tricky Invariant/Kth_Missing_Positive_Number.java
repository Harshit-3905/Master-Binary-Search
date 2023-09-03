import java.util.*;

class Kth_Missing_Positive_Number {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();
        System.out.println(Solution(a, k));
        in.close();
    }

    public static int Solution(int[] a, int k) {
        int low = 0, high = a.length - 1;
        int ans = -1;
        while (low <= high) {
            if (low == high) {
                if (a[low] - (low + 1) < k)
                    ans = low + k + 1;
                else
                    ans = low + k;
                break;
            }
            int mid = (low + high) / 2;
            // System.out.println(mid);
            if (a[mid] - (mid + 1) < k)
                low = mid + 1;
            else
                high = mid;
        }
        return ans;
    }
}