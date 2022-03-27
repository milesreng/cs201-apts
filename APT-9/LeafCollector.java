import java.util.ArrayList;

import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        if (tree == null) {
            return null;
        }
        List<String> levels = new ArrayList<>();
        List<String> leaves;
        while (!isLeaf(tree)) {
            leaves = new ArrayList<>();
            collectAndRemove(tree, leaves);
            levels.add(String.join(" ", leaves));
        }
        levels.add("" + tree.info);
        tree = null;

        String[] ret = new String[levels.size()];
        int i = 0;
        for (String level : levels) {
            ret[i] = level;
            i++;
        }
        return ret;
    }

    private void collectAndRemove(TreeNode tree, List<String> list) {
        if (tree.left != null && isLeaf(tree.left)) {
            list.add("" + tree.left.info);
            tree.left = null;
        } else if (tree.left != null) {
            collectAndRemove(tree.left, list);
        }

        if (tree.right != null && isLeaf(tree.right)) {
            list.add("" + tree.right.info);
            tree.right = null;
        } else if (tree.right != null) {
            collectAndRemove(tree.right, list);
        }
    }

    private boolean isLeaf(TreeNode tree) {
        if (tree.left == null && tree.right == null) {
            return true;
        }
        return false;
    }
}