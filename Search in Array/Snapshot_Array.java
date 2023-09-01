import java.util.*;

class SnapshotArray {

    TreeMap<Integer, Integer>[] snapshotArray;
    int snap_id;

    public SnapshotArray(int length) {
        this.snapshotArray = new TreeMap[length];
        this.snap_id = 0;
        for (int i = 0; i < length; i++) {
            snapshotArray[i] = new TreeMap<>();
            snapshotArray[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        snapshotArray[index].put(snap_id, val);
    }

    public int snap() {
        return snap_id++;
    }

    public int get(int index, int snap_id) {
        return snapshotArray[index].floorEntry(snap_id).getValue();
    }
}