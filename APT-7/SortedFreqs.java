import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        Map<String, Integer> map = new TreeMap<>();
        Arrays.sort(data);
        for (String d : data) {
            map.putIfAbsent(d, 0);
            map.put(d, map.get(d) + 1);
        }
        Integer[] convert = map.values().toArray(new Integer[0]);
        int[] counts = new int[convert.length];
        for(int i = 0; i < counts.length;i++) {
            counts[i] = convert[i];
        }

        return counts;
    }
}