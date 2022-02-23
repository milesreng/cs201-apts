import java.util.*;

public class LengthSort {
    public String[] rearrange(String[] values) {
        int i;
        int j;
        String temp;

        Arrays.sort(values);
        
        for (i = 1; i < values.length; ++i) {
            j = i;
            while (j > 0 && values[j].length() < values[j - 1].length()) {
            
                temp = values[j];
                values[j] = values[j - 1];
                values[j - 1] = temp;
                --j;
            }
        }

        return values;
    }
}