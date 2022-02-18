import resources.*;

public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
        ListNode first = a;
        ListNode list = a;
        while (b != null) {
            list.next = new ListNode(b.info, list.next);
            list = list.next.next;
            b = b.next;
        }
        return first;
    }
}