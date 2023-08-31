import java.util.*;

class Search_A_2D_Matrix {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        int target = in.nextInt();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();
        System.out.println(searchMatrix(matrix, target));
        in.close();
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target && matrix[mid][n - 1] >= target) {
                row = mid;
                break;
            } else if (matrix[mid][0] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[row][mid] == target)
                return true;
            else if (matrix[row][mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}