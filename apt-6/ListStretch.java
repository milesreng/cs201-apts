import resources.ListNode;

public class ListStretch {
    public ListNode stretch(ListNode list, int amount) {
        ListNode currNode = list;
        // infinite loop
        while (currNode != null) {
            for (int i = 0; i < amount; i++) {
                currNode.next = new ListNode(currNode.info, currNode.next);
            }
            currNode = currNode.next;
        }
        return list;
    }
}