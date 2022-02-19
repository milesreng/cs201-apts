import java.util.*;

public class GuessWord {
    public int getPoints(String word, String target) {
        char[] wordCh = word.toCharArray();
        char[] targetCh = target.toCharArray();
        ArrayList<Integer> wAccess = new ArrayList<>();
        ArrayList<Integer> tAccess = new ArrayList<>();
        int points = 0;

        for (int i = 0; i < wordCh.length; i++) {
            for (int j = 0; j < targetCh.length; j++) {
                if (wordCh[i] == targetCh[j] && !wAccess.contains(i) && !tAccess.contains(j)) {
                    points++;
                    if (i == j) {
                        points++;
                    }
                    wAccess.add(i);
                    tAccess.add(j);
                }
            }
        }
        return points;
    }
}