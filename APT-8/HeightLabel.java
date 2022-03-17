public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) {
            return t;
        }
        return new TreeNode(findHeight(t), rewire(t.left), rewire(t.right));
    }

    public int findHeight(TreeNode t) {
        if (t == null) {
            return 0;
        }
        return 1 + Math.max(findHeight(t.left), findHeight(t.right));
    }
}