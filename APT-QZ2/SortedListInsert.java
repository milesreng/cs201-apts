public class SortedListInsert {
    public ListNode insertArray(ListNode list, int[] values) {
        for (int val : values) {
            list = insertVal(list, val);
        }

        return list;
    }

    private ListNode insertVal(ListNode list, int val) {
        if (list == null) {
            return new ListNode(val);
        } else if (val < list.info) {
            return new ListNode(val, list);
        }

        ListNode last = list;
        while (last.next != null && val > last.next.info) {
            last = last.next;
        }

        if (last.next == null) {
            last.next = new ListNode(val);
        } else {
            ListNode temp = last.next;
            last.next = new ListNode(val, temp);
        }

        return list;
    }

}