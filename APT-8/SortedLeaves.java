import java.util.*;

public class SortedLeaves {
    public String[] values(TreeNode tree) {
        List<Integer> vals = getLeaf(tree);
        String[] letters = new String[vals.size()];
        int i = 0;
        for (Integer val : vals) {
            int valInt = val.intValue();
            char ch = (char)valInt;
            letters[i] = String.valueOf(ch);
            i++;
        }
        Arrays.sort(letters);
        return letters;
    }

    public List<Integer> getLeaf(TreeNode tree) {
        if (tree == null) {
            return new ArrayList<>();
        }
        if (tree.left == null && tree.right == null) {
            List<Integer> ret = new ArrayList<>();
            ret.add(tree.info);
            return ret;
        }

        List<Integer> ret = new ArrayList<>();
        ret.addAll(getLeaf(tree.left));
        ret.addAll(getLeaf(tree.right));
        return ret;
    }
}