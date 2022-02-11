import resources.ListNode;

public class RemoveMin {
    public ListNode remove(ListNode list) {
        int minVal = list.info;
        ListNode currNode = list;
        ListNode lastNode = list;
        ListNode preMin = list;

        while (currNode.next != null) {
            lastNode = currNode;
            currNode = currNode.next;
            if (currNode.info < minVal) {
                preMin = lastNode;
                minVal = currNode.info;
            }
        }

        if (minVal == list.info) {
            return list.next;
        } else {
            preMin.next = preMin.next.next;
            return list;
        }
    }
}