import resources.*;

public class SortedListRemoval {
    public ListNode uniqify(ListNode list) {
        ListNode first = list;
        ListNode checkDup = list;
        while (list != null) {
            while (checkDup != null && checkDup.info == list.info) {
                checkDup = checkDup.next;
            }
            if (checkDup == null) {
                list.next = null;
            } else {
                list.next = checkDup;
            }
            list = list.next;
        }
        return first;
    }
}