import java.util.*;

class Find_Element_that_Appears_Twice {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println(Solution(n, a));
        in.close();
    }

    static int Solution(int n, int a[]) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 0) {
                if (mid != n - 1 && a[mid] == a[mid + 1])
                    low = mid + 1;
                else
                    high = mid;
            } else {
                if (mid != 0 && a[mid] == a[mid - 1])
                    low = mid + 1;
                else
                    high = mid;
            }
        }
        return a[low];
    }
}