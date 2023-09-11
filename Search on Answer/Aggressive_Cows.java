import java.util.*;

class Aggressive_Cows {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int stalls[] = new int[n];
        int k = in.nextInt();
        for (int i = 0; i < n; i++)
            stalls[i] = in.nextInt();
        System.out.println(Solution(stalls, k));
        in.close();
    }

    static int Solution(int stalls[], int k) {
        int low = 1, high = Integer.MAX_VALUE;
        int ans = -1;
        Arrays.sort(stalls);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int last = 0;
            int c = 1;
            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - stalls[last] >= mid) {
                    last = i;
                    c++;
                }
            }
            if (c >= k) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
}