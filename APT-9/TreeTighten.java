public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null) {
            return null;
        } else if (t.left == null && t.right == null) {
            return t;
        }

        if (t.left == null) {
            t = tighten(t.right);
        } else if (t.right == null) {
            t = tighten(t.left);
        } else {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
        }

        return t;
    }
}