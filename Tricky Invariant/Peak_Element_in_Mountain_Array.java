import java.util.*;

class Peak_Element_in_Mountain_Array {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = in.nextInt();
        System.out.println(Solution(arr));
        in.close();
    }

    public static int Solution(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}