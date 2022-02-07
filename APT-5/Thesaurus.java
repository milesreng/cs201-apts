import java.util.*;

public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<TreeSet<String>> list = convert(entry);

        while (true) {
            int size = list.size();
            System.out.println("set size before is " + list.size());
            list = combine(list);
            System.out.print(list.toString());
            System.out.println("set size after is " + list.size());
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
                    System.out.print(set.toString() + " + " + set2.toString());
                    
                    set.addAll(set2);
                    System.out.println(" = " + set.toString());
                    
                    if (set.size() <= (list.get(i).size() + set2.size() - 2)) {
                        System.out.println(set.toString() + " -> similar");
                        foundSimilar = true;
                        newList.add(set);
                        similar = j;
                        break;
                    }
                }
                if (!foundSimilar) {
                    newList.add(list.get(i));
                }
                System.out.println("set is " + newList.toString());
            } else if (i != similar) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Thesaurus t = new Thesaurus();
        String[] l = {"ape monkey wrench", "wrench twist strain", "monkey twist frugue strain"};
        System.out.print(String.join(" - ", t.edit(l)));
    }
}