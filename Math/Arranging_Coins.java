import java.util.*;

class Arranging_Coins {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Solution(n));
        in.close();
    }

    public static int Solution(int n) {
        int low = 1, high = n;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long x = (1l * mid * (mid + 1)) / 2;
            if (x == n) {
                ans = mid;
                break;
            } else if (x < n) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
}