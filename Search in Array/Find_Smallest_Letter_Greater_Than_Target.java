import java.util.*;

class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] letters = new char[n];
        String s = in.nextLine();
        for (int i = 0; i < n; ++i)
            letters[i] = s.charAt(i);
        char target = in.next().charAt(0);
        System.out.println(nextGreatestLetter(letters, target));
        in.close();
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        char ans = letters[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                ans = letters[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}