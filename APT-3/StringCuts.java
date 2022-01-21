import java.util.*;

public class StringCuts {

    public String[] filter(String[] list, int minLength) {
        ArrayList<String> unique = new ArrayList<String>();
        for (String word : list) {
            if (word.length() >= minLength && !unique.contains(word)) {
                unique.add(word);
            }
        }
        String[] uniqueWords = unique.toArray(new String[0]);

        return uniqueWords;
    }

}