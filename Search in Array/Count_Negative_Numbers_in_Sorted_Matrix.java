import java.util.*;

class Count_Negative_Numbers_in_Sorted_Matrix {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; j++)
                grid[i][j] = in.nextInt();
        System.out.println(countNegatives(grid));
        in.close();
    }

    public static int countNegatives(int[][] grid) {
        int i = grid.length - 1;
        int j = 0;
        int count = 0;
        while (i >= 0) {
            j = grid[i].length - 1;
            while (j >= 0) {
                if (grid[i][j] >= 0)
                    break;
                else
                    count++;
                j--;
            }
            i--;
        }
        return count;
    }
}