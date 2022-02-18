import resources.*;

public class SortedListRemoval {
    public ListNode uniqify(ListNode list) {
        // ListNode first = list;
        // ListNode checkDup = list;
        // while (list != null) {
        //     while (checkDup != null && checkDup.info == list.info) {
        //         checkDup = checkDup.next;
        //     }
        //     if (checkDup == null) {
        //         list.next = null;
        //     } else {
        //         list.next = checkDup;
        //     }
        //     list = list.next;
        // }
        // return first;

        ListNode first = list;
        ListNode prev = first;
        ListNode current = first.next;

        while(current != null){
            if (current.info == prev.info){
                prev = current.next;
            }
            current = current.next;
        }
        return first;
    }

    public static void main(String[] args){

        SortedListRemoval test = new SortedListRemoval();
 
        // TODO - Create your test input
        // Assumes ListNode class defined privately in same
        // file or in another file in same directory.
 
        ListNode testInput = new ListNode(1);
        testInput.next = new ListNode(1);
        testInput = testInput.next;
 
        // Next line runs test and prints output
        // Assumes a static printList method in a ListNodeUtil class
        // as in previous discussion, can change the line as needed.
 
        ListNodeUtil.printList(test.uniqify(testInput));
 
    }
}