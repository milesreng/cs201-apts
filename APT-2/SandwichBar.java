import java.util.*;

public class SandwichBar {
    
    public int whichOrder(String[] available, String[] orders) {
        List<String> availList = Arrays.asList(available);
        String[] currentOrder;

        for (int i = 0; i < orders.length; i++) {
            currentOrder = orders[i].split(" ");
            Boolean complete = true;
            for (String ingr : currentOrder) {
                if (!availList.contains(ingr)) {
                    complete = false;
                }
            }

            if (complete) {
                return i;
            }
        }
        return -1;
    }

}
