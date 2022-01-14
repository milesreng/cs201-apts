import java.util.*;

public class Common {

    public int count(String a, String b) {
        HashSet<String> common = new HashSet<>();
        List<String> aList = Arrays.asList(a.split(""));
        List<String> bList = Arrays.asList(b.split(""));

        for (String s : aList) {
            if (bList.contains(s)) {
                common.add(s);
            }
        }
        return common.size();
    }
    
}
