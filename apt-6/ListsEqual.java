public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        if (a1 == null && a2 == null) {
            return 1;
        } else if (a1 == null || a2 == null) {
            return 0;
        }
        if (a1.info != a2.info) {
            return 0;
        }
        ListNode node1 = a1;
        ListNode node2 = a2;
        while (node1.next != null && node2.next != null) {
            if (node1.next.info != node2.next.info) {
                return 0;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        if (node1.next != null || node2.next != null) {
            return 0;
        }
        return 1;
    }
}