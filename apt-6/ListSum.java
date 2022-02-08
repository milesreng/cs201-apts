public class ListSum {
    public int sum(ListNode list, int thresh) {
        int s = 0;
        if (list != null && list.info > thresh) {
            s += list.info;
        }
        ListNode currNode = list;
        while (currNode.next != null) {
            currNode = currNode.next;
            if (currNode.info > thresh) {
                s += currNode.info;
            }
        }
        return s;
    }
}