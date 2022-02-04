import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        TreeSet<String> allWords = new TreeSet<String>();
        for (String phrase : list) {
            String[] words = phrase.split(" ");
            for (int j = 0; j < words.length; j++) {
                allWords.add(words[j]);
            }
        }

        String[] last = new String[allWords.size()];
        int i = 0;
        for (String word : allWords) {
            last[i] = word;
            i++;
        }
        return String.join(" ", last);
    }
}