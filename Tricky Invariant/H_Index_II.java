import java.util.*;

class H_Index_II {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] citations = new int[n];
        for (int i = 0; i < n; ++i)
            citations[i] = in.nextInt();
        System.out.println(Solution(citations));
        in.close();
    }

    public static int Solution(int[] citations) {
        int N = citations.length;
        int left = 0;
        int right = citations.length - 1;

        while (left <= right) {
            int h = left + (right - left) / 2;
            if (citations[h] == N - h) {
                return N - h;
            } else if (citations[h] > N - h) {
                right = h - 1;
            } else {
                left = h + 1;
            }
        }
        return N - left;
    }
}