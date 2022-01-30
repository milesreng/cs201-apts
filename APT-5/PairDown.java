import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> combine = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i += 2) {
            if (i == list.length - 1) {
                combine.add(list[i]);
            } else {
                combine.add(list[i] + list[i + 1]);
            }
        }
        int[] comb = new int[combine.size()];

        for (int i = 0; i < comb.length; i++) {
            comb[i] = combine.get(i);
        }
        return comb;
    }
}