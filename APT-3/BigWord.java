import java.util.*;

public class BigWord {

    public String most(String[] sentences) {
        ArrayList<String> unique = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                if (!unique.contains(words[j].toLowerCase())) {
                    unique.add(words[j].toLowerCase());
                    count.add(0);
                }
                count.set(unique.indexOf(words[j]), count.get(unique.indexOf(words[j])) + 1);
            }
        }

        return unique.get(count.indexOf(Collections.max(count)));
    }
    
}
