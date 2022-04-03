import java.util.*;

public class OlympicCandles {
    public int numberOfNights(int[] candles) {
        Integer[] c = new Integer[candles.length];
        for (int i = 0; i < candles.length; i++) {
            c[i] = candles[i];
        }
        Arrays.sort(c, Collections.reverseOrder());
        int nights = 0;
        while (!isEmpty(c)) {
            if (nights >= c.length) {
                return nights;
            }
            for (int n = 0; n < nights + 1; n++) {
                if (c[n] <= 0) {
                    return nights;
                }
                c[n]--;
            }
            nights++;
            Arrays.sort(c, Collections.reverseOrder());
        }
        return nights;
    }

    private boolean isEmpty(Integer[] list) {
        for (int i : list) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}