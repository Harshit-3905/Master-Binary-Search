
class Search_in_Sorted_Array_of_Unknown_Size {

    public int search(ArrayReader reader, int target) {
        int left = 0, right = 20000;
        while (left < right) {
            int mid = left + right >> 1;
            if (reader.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return reader.get(left) == target ? left : -1;
    }

}

class ArrayReader {
    public int get(int index) {
        // return returns the element of the array at index
        return 0;
    }
}