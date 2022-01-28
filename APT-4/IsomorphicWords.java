import java.util.*;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                HashMap<Character, Character> charMap = new HashMap<Character, Character>();
                String word = words[i];
                String word2 = words[j];
                Boolean iso = true;

                for (int k = 0; k < word.length(); k++) {
                    Character letter = word.charAt(k);
                    Character letter2 = word2.charAt(k);
                    
                    if (!charMap.containsKey(letter) && !charMap.containsValue(letter2)) {
                        charMap.put(letter, letter2);
                    } else {
                        if (charMap.get(letter) != letter2) {
                            iso = false;
                        }
                    }
                }
                if (iso) {
                    count++;
                }
            }
        }
        return count;
    }
}