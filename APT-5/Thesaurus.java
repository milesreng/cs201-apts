import java.util.*;

public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<TreeSet<String>> list = convert(entry);

        while (true) {
            int size = list.size();
            list = combine(list);
            System.out.print(list.toString());
            if (list.size() == size) {
                break;
            }
        }

        ArrayList<String> ret = new ArrayList<>();
        for (TreeSet<String> set : list) {
            String s = String.join(" ", set);
            ret.add(s);
        }
        String[] finRet = new String[ret.size()];
        int i = 0;

        for (String r : ret) {
            finRet[i] = r;
            i++;
        }
        Arrays.sort(finRet);

        return finRet;
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
        int similar = -1;
        
        Boolean foundSimilar = false;
        for (int i = 0; i < list.size(); i++) {
            if (!foundSimilar) {
                for (int j = i + 1; j < list.size(); j++) {
                    TreeSet<String> set = new TreeSet<>();
                    set.addAll(list.get(i));
                    TreeSet<String> set2 = list.get(j);
                    
                    set.addAll(set2);
                    
                    if (set.size() <= (list.get(i).size() + set2.size() - 2)) {
                        foundSimilar = true;
                        newList.add(set);
                        similar = j;
                        break;
                    }
                }
                if (!foundSimilar) {
                    newList.add(list.get(i));
                }
            } else if (i != similar) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}