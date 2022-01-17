import java.util.*;

public class StringCuts {

    public String[] filter(String[] list, int minLength) {
        ArrayList<String> unique = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength && !unique.contains(list[i])) {
                unique.add(list[i]);
            }
        }
        String[] uniqueWords = new String[unique.size()];
        for (int i = 0; i < uniqueWords.length; i++) {
            uniqueWords[i] = unique.get(i);
        }

        return uniqueWords;
    }

}