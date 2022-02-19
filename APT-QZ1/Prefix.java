import java.util.*;

public class Prefix {
    public String[] group(String[] words) {
        Arrays.sort(words);
        ArrayList<ArrayList<String>> prefix = new ArrayList<>();
        
        for (String w : words) {
            Boolean foundPref = false;

            for (ArrayList<String> prefList : prefix) {
                String first = prefList.get(0);

                if (w.length() >= first.length() && first.equals(w.substring(0, first.length()))) {
                    foundPref = true;
                    prefList.add(w);
                }
            }

            if (!foundPref) {
                ArrayList<String> newPref = new ArrayList<>();
                newPref.add(w);
                prefix.add(newPref);
            }
        }

        String[] ret = new String[prefix.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = String.join(" ", prefix.get(i));
        }

        Arrays.sort(ret);
        return ret;
    }
}