import java.util.*;

public class SetAside {
    public String common(String[] list) {
        ArrayList<String> all = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            String[] words = list[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                all.add(words[j]);
            }
        }

        ArrayList<String> commonWords = new ArrayList<String>();
        for (String word : all) {
            if (Collections.frequency(all, word) == list.length) {
                commonWords.add(word);
            }
        }

        String[] ret = new String[commonWords.size()];

        int i = 0;
        for (String word : commonWords) {
            ret[i] = word;
            i++;
        }
        Arrays.sort(ret);

        return String.join(" ", ret);
    }
}