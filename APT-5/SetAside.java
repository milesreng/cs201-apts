import java.util.*;

public class SetAside {
    public String common(String[] list) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        for (String phrase : list) {
            String[] splitPhrase = phrase.split(" ");
            for (String word : splitPhrase) {
                words.putIfAbsent(word, 0);
                words.put(word, words.get(word) + 1);
            }
        }

        ArrayList<String> commonWords = new ArrayList<String>();
        for (String key : words.keySet()) {
            if (words.get(key) == list.length) {
                commonWords.add(key);
            }
        }

        String[] w = new String[commonWords.size()];
        for (int i = 0; i < commonWords.size(); i++) {
            w[i] = commonWords.get(i);
        }

        Arrays.sort(w);
        return String.join(" ", w);
    }
}