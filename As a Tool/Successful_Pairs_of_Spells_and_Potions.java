import java.util.*;

class Successful_Pairs_of_Spells_and_Potions {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long success = in.nextLong();
        int[] spells = new int[n];
        for (int i = 0; i < n; i++) {
            spells[i] = in.nextInt();
        }
        int[] potions = new int[m];
        for (int i = 0; i < m; i++) {
            potions[i] = in.nextInt();
        }
        int[] result = successfulPairs(spells, potions, success);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        in.close();
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if ((long) spells[i] * potions[m - 1] < success) {
                ans[i] = 0;
                continue;
            }
            if ((long) spells[i] * potions[0] >= success) {
                ans[i] = m;
                continue;
            }
            int l = 0, r = m - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long) spells[i] * potions[mid] < success) {
                    l = mid + 1;
                } else {
                    ans[i] = m - mid;
                    r = mid - 1;
                }
            }
        }
        return ans;
    }
}