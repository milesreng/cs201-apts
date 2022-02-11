import resources.ListNode;

public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null) {
            return null;
        }
        ListNode currNode = list;
        ListNode prevNode = list;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        currNode.next = list;
        prevNode.next = null;

        return currNode;
    }
}