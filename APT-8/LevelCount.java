public class LevelCount {
    public int count(TreeNode t, int level) {
        return findLevel(t, level, 0);
    }

    public int findLevel(TreeNode t, int target, int currLevel) {
        if (t == null) {
            return 0;
        } else if (currLevel == target) {
            return 1;
        }
        return findLevel(t.left, target, currLevel + 1) + findLevel(t.right, target, currLevel + 1);
    }
}