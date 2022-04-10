import java.util.*;

public class TreeImbalance {

    List<Integer> imb = new ArrayList<>();

    public int imbalance(TreeNode t) {
        countNodes(t);
        if (imb.size() > 0) {
            return Collections.max(imb);
        }
        return 0;
    }

    private int getSubNodes(TreeNode t) {
        if (t == null) {
            return 0;
        }

        return getSubNodes(t.left) + getSubNodes(t.right) + 1;
    }

    private int getImbalance(TreeNode t) {
        int leftNodes = getSubNodes(t.left);
        int rightNodes = getSubNodes(t.right);

        return Math.abs(leftNodes - rightNodes);
    }

    private void countNodes(TreeNode t) {
        if (t == null) {
            return;
        }

        if (t.left != null) {
            countNodes(t.left);
        }

        imb.add(getImbalance(t));

        if (t.right != null) {
            countNodes(t.right);
        }
    }
}