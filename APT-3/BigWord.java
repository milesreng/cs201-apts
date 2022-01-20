import java.util.*;

public class BigWord {

    public String most(String[] sentences) {
        // Use a HashMap
        HashMap<String, Integer> uniqueMap = new HashMap<String, Integer>();
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");

            for (int j = 0; j < words.length; j++) {
                String word = words[j].toLowerCase();
                uniqueMap.putIfAbsent(word, 0);
                uniqueMap.put(word, uniqueMap.get(word) + 1);
            }
        }

        Map.Entry<String, Integer> mostFrequent = null;
        for (Map.Entry<String, Integer> entry : uniqueMap.entrySet()) {
            if (mostFrequent == null || entry.getValue().compareTo(mostFrequent.getValue()) > 0) {
                mostFrequent = entry;
            }
        }

        return mostFrequent.getKey();
    }
    
}
