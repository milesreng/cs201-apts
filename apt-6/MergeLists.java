import resources.*;

public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
        ListNode first = a;
        ListNode list = a;
        ListNode secList = b;
        while (secList != null) {
            list.next = new ListNode(secList.info, list.next);
            list = list.next.next;
            secList = secList.next;
        }
        return first;
    }
}