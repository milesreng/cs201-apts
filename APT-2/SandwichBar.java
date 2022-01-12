public class SandwichBar {
    
    public int whichOrder(String[] available, String[] orders) {
        for (int i = 0; i < orders.length; i++) {
            String[] order = orders[i].split(" ");
            for (int j = 0; j < order.length; j++) {
                if (available.contains(order[j])) {
                    return 0;
                }
            }
        }
        return 0;
    }

}
