import java.util.*;

class Nth_Root_of_Integer {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(NthRoot(n, m));
        in.close();
    }

    public static int NthRoot(int n, int m) {
        int l = 1;
        int h = m;
        while (l <= h) {
            int mid = l - (l - h) / 2;
            if (Math.pow(mid, n) == m)
                return mid;
            else if (Math.pow(mid, n) > m)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}