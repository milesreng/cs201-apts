import java.util.*;

public class SetAside {
    public String common(String[] list) {
        Set<String> commonWords = new TreeSet<String>(Arrays.asList(list[0].split(" ")));

        for (String phrase : list) {
            Set<String> phraseWords = new TreeSet<String>(Arrays.asList(phrase.split(" ")));
            commonWords.retainAll(phraseWords);
        }

        return String.join(" ", commonWords);
    }
}