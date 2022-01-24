import java.util.*;

public class CounterAttack {

    public int[] analyze(String str, String[] words) {
        List<String> strList = Arrays.asList(str.split(" "));
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i] = Collections.frequency(strList, words[i]);
        }
        return count;
    }
    
}
