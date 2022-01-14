import java.io.*;
import java.util.*;

public class SimpleWordGame {

    public int points(String[] player, String[] dictionary) {
        HashSet<String> unique = new HashSet<>(Arrays.asList(player));
        List<String> wordList = Arrays.asList(dictionary);
        int total = 0;

        for (String s : unique) {
            if (wordList.contains(s)) {
                total += s.length() * s.length();
            }
        }

        return total;
    }
    
}
