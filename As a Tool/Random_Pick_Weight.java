import java.util.*;

class Random_Pick_Weight {
    Random rand;
    int prefix[];
    int totalSum;

    public Random_Pick_Weight(int[] w) {
        rand = new Random();
        prefix = new int[w.length];
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            prefix[i] = sum;
        }
        totalSum = sum;
    }

    public int pickIndex() {
        int target = rand.nextInt(totalSum) + 1;
        int left = 0;
        int right = prefix.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefix[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}