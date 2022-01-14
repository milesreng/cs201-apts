import java.util.*;

public class Common {

    public int count(String a, String b) {
        List<String> aList = Arrays.asList(a.split(""));
        List<String> bList = Arrays.asList(b.split(""));
        int total = 0;

        for (String s : aList) {
            if (bList.contains(s)) {
                total++;
                bList.set(bList.indexOf(s), "");
            }
        }
        return total;
    }
    
}
