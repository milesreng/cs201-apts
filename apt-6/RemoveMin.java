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
            preMin.next = currNode.next;
            return list;
        }
    }

    public static void main(String[] args) {
        RemoveMin r = new RemoveMin();
        int[] nums = {2, 1, 4, 9, 6, 7, 8};
        ListNode currNode = new ListNode(3);
        
        for (int n : nums) {
            ListNode lastNode = currNode;
            currNode = new ListNode(n, lastNode);
            System.out.println(currNode.info + " -> " + currNode.next.info);
        }

        ListNode newFirst = r.remove(currNode);
        while (newFirst.next != null) {
            System.out.println(newFirst.info);
            newFirst = newFirst.next;
        }
    }
}