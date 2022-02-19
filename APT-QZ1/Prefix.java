import java.util.*;

public class Prefix {
    public String[] group(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        TreeSet<ArrayList<String>> prefix = new TreeSet<>();
        for (String w : words) {
            Boolean foundComm = false;
            for (ArrayList<String> common : prefix) {
                if (common.get(0) == w.substring(0, common.get(0).length())) {
                    common.add(w);
                    foundComm = true;
                }
            }
            if (!foundComm) {
                ArrayList<String> newComm = new ArrayList<>();
                newComm.add(w);
                prefix.add(newComm);
            }
        }

        ArrayList<String> red = new ArrayList<>();
        for (ArrayList<String> pref : prefix) {
            red.add(String.join(" ", pref));
        }

        String[] ret = new String[red.size()];
        for (int i = 0; i < red.size(); i++) {
            ret[i] = red.get(i);
        }

        return ret;
    }
}