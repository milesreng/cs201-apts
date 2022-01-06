import java.util.*;

public class Starter {

    public int begins(String[] words, String first) {
        int count = 0;
        List<String> unique = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == first.charAt(0) && !unique.contains(words[i])) {
                count++;
                unique.add(words[i]);
            }
        }
        return count;
    }

}
