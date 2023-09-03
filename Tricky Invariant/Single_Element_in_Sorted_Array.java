import java.util.*;

class Single_Element_in_Sorted_Array {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();
        System.out.println(Solution(a));
        in.close();
    }

    public static int Solution(int[] a) {
        int n = a.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid != 0 && a[mid] == a[mid - 1]) {
                if (mid % 2 != 0)
                    low = mid + 1;
                else
                    high = mid - 1;
            } else if (mid != n - 1 && a[mid] == a[mid + 1]) {
                if (mid % 2 != 0)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                return a[mid];
            }
        }
        return -1;
    }
}