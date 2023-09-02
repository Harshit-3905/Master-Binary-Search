
class Perfect_Squares {

    public boolean isPerfectSquare(int num) {
        long s = 1, e = num - 1;
        if (num == 1)
            return true;
        while (s <= e) {
            long mid = (s + e) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return false;
    }
}