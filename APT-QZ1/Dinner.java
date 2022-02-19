import java.util.*;

public class Dinner {
    public String favorite(String[] preferences) {
        ArrayList<List<String>> pref = new ArrayList<>();

        for (int i = 0; i < preferences.length; i++) {
            pref.add(Arrays.asList(preferences[i].split(" ")));
        }

        for (int i = 0; i < pref.get(0).size(); i++) {
            String fav = pref.get(0).get(i);
            Boolean isCommon = true;

            for (int j = 1; j < pref.size(); j++) {
                if (!pref.get(j).contains(fav)) {
                    isCommon = false;
                }
            }

            if (isCommon) {
                return fav;
            }
        }

        return "";
    }
}