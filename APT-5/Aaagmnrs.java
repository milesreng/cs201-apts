import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> notAnagrams = new ArrayList<>();
        ArrayList<String> sortedLetters = new ArrayList<>();
        for (String p : phrases) {
            char[] pChars = p.replaceAll(" ", "").toLowerCase().toCharArray();
            Arrays.sort(pChars);
            String s = new String(pChars);
            if (!sortedLetters.contains(s)) {
                sortedLetters.add(s);
                notAnagrams.add(p);
            }
        }

        String[] remaining = new String[notAnagrams.size()];
        notAnagrams.toArray(remaining);
        return remaining;
    }
}