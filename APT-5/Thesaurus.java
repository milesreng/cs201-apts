import java.util.*;

public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<TreeSet<String>> list = convert(entry);

        while (true) {
            int size = list.size();
            list = combine(list);
            if (list.size() == size) {
                break;
            }
        }

        ArrayList<String> ret = new ArrayList<>();
        for (TreeSet<String> set : list) {
            String s = String.join(" ", set);
            ret.add(s);
        }
        return entry;
    }

    private ArrayList<TreeSet<String>> convert(String[] entry) {
        // iterate through entry and convert each to a TreeSet
        ArrayList<TreeSet<String>> newEntry = new ArrayList<TreeSet<String>>();
        for (String e : entry) {
            newEntry.add(new TreeSet<String>(Arrays.asList(e.split(" "))));
        }
        return newEntry;
    }

    private ArrayList<TreeSet<String>> combine(ArrayList<TreeSet<String>> list) {
        // iterate through list, if there are strings with 2+ common words, combine + return new list
        ArrayList<TreeSet<String>> newList = new ArrayList<TreeSet<String>>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                TreeSet<String> set = new TreeSet<String>(list.get(i));
                TreeSet<String> set2 = new TreeSet<String>(list.get(j));
                set.addAll(set2);
                if (set.size() <= list.get(i).size() + set2.size() - 2) {
                    newList.add(set);
                } else {
                    newList.add(list.get(i));
                    newList.add(set2);
                }
            }
        }
        return newList;
    }
}