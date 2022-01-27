import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        HashSet<String> set1 = new HashSet<String>(Arrays.asList(club1));
        HashSet<String> set1intersect = new HashSet<String>(Arrays.asList(club1));
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(club2));
        HashSet<String> set3 = new HashSet<String>(Arrays.asList(club3));

        HashSet<String> common = new HashSet<String>();
        set1.retainAll(set2);
        set1intersect.retainAll(set3);
        set2.retainAll(set3);

        common.addAll(set1);
        common.addAll(set1intersect);
        common.addAll(set2);

        String[] dish = new String[common.size()];
        int i = 0;
        for (String name : common) {
            dish[i] = name;
            i++;
        }
        Arrays.sort(dish);

        return dish;
    }
}