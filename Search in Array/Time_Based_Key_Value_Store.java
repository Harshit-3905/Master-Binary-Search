import java.util.*;

class Time_Based_Key_Value_Store {
    HashMap<String, TreeMap<Integer, String>> map;

    public Time_Based_Key_Value_Store() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key))
            map.get(key).put(timestamp, value);
        else {
            TreeMap<Integer, String> m = new TreeMap<>();
            m.put(timestamp, value);
            map.put(key, m);
        }
    }

    public String get(String key, int timestamp) {
        if (map.containsKey(key)) {
            if (map.get(key).floorEntry(timestamp) != null)
                return map.get(key).floorEntry(timestamp).getValue();
        }
        return "";
    }
}