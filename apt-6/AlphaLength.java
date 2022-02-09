import java.util.*;
import resources.ListNode;

public class AlphaLength {
    public ListNode create(String[] words) {
        Arrays.sort(words);
        ListNode lastNode = new ListNode(words[words.length - 1].length());
        ListNode currNode = new ListNode(words[0].length());
        ArrayList<String> unique = new ArrayList<>();
        unique.add(words[words.length - 1]);

        for (int i = words.length - 2; i >= 0; i--) {
            if (!unique.contains(words[i])) {
                unique.add(words[i]);
                currNode = new ListNode(words[i].length());
                currNode.next = lastNode;
                lastNode = currNode;
            }
        }
        return currNode;
    }
}