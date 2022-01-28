import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        Set<String> set1 = new HashSet<String>(Arrays.asList(club1));
        Set<String> set2 = new HashSet<String>(Arrays.asList(club2));
        Set<String> set3 = new HashSet<String>(Arrays.asList(club3));
        Set<String> common = new HashSet<String>();

        common.addAll(intersection(set1, set2));
        common.addAll(intersection(set1, set3));
        common.addAll(intersection(set2, set3));

        String[] dish = common.toArray(new String[0]);
        Arrays.sort(dish);

        return dish;
    }

    private Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> s = new HashSet<String>(set1);
        s.retainAll(set2);
        return s;
    }
}