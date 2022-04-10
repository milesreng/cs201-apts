public class PathLabel {
    public TreeNode label(TreeNode t) {
        return replace(t, getPaths(t));
    }

    private int getPaths(TreeNode t) {
        if (t == null) {
            return 0;
        } else if (t.left == null && t.right == null) {
            return 1;
        }
        
        return getPaths(t.left) + getPaths(t.right);
    }

    private TreeNode replace(TreeNode t, int paths) {
        if (t == null) {
            return t;
        }

        t.info = paths;
        t.left = replace(t.left, getPaths(t.left));
        t.right = replace(t.right, getPaths(t.right));

        return t;
    }
}