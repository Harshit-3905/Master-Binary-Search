import java.util.*;

class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = in.nextInt();
        int a[] = searchRange(nums, target);
        System.out.println(a[0] + " " + a[1]);
        in.close();
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int a[] = new int[2];
        if (n == 1) {
            if (nums[0] == target) {
                a[0] = 0;
                a[1] = 0;
            } else {
                a[0] = -1;
                a[1] = -1;
            }
            return a;
        }
        int s = 0, e = n - 1;
        int mid = 0;
        boolean flag = false;
        while (s <= e) {
            mid = (s + e) / 2;
            if (nums[mid] == target) {
                if (mid != 0 && nums[mid - 1] == target)
                    e = mid - 1;
                else {
                    flag = true;
                    break;
                }
            } else if (nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }

        if (flag == false) {
            a[0] = -1;
            a[1] = -1;
        } else {
            a[0] = mid;
            for (int i = mid; i < n; i++) {
                if (i == n - 1 || nums[i + 1] != target) {
                    a[1] = i;
                    break;
                }
            }
        }
        return a;
    }
}