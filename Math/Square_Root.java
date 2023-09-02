
class Square_Root {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;

        int left = 1;
        int right = x;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (middle < (x / middle))
                left = middle + 1;
            else if (middle > (x / middle))
                right = middle - 1;
            else
                return middle;
        }
        return right;
    }
}