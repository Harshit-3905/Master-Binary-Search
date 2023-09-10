import java.util.*;

class Allocate_Books {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int books[] = new int[n];
        for (int i = 0; i < n; i++)
            books[i] = in.nextInt();
        int students = in.nextInt();
        System.out.println(Solution(n, books, students));
        in.close();
    }

    static long Solution(int n, int[] books, int students) {
        long high = 0;
        long low = 1;
        long ans = -1;
        for (int x : books) {
            high += x;
            low = Math.max(low, x);
        }
        while (low <= high) {
            long mid = low + (high - low) / 2;
            int c = 1;
            long curr = 0;
            for (int x : books) {
                curr += x;
                if (curr > mid) {
                    curr = x;
                    c++;
                }
            }
            if (c <= students) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}