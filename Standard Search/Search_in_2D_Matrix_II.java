import java.util.*;

class Search_A_2D_Matrix_II {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        int target = in.nextInt();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();
        System.out.println(search(matrix, target));
        in.close();
    }

    public static Pair search(int[][] matrix, int x) {
        int m = matrix.length;
        int n = matrix[0].length;
        int p = 0;
        int q = n - 1;
        Pair ans = new Pair(-1, -1);
        while (p < m && q >= 0) {
            if (matrix[p][q] == x) {
                ans = new Pair(p, q);
                return ans;
            } else if (matrix[p][q] > x)
                q--;
            else
                p++;
        }
        return ans;
    }
}

class Pair {
    int x, y;

    Pair(int a, int b) {
        x = a;
        y = b;
    }
}