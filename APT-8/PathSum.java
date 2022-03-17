public class PathSum {
    public int hasPath(int target, TreeNode tree){
        if (tree == null) {
            return 0;
        }
        return findSum(tree, target, 0);
    }

    public int findSum(TreeNode tree, int target, int end) {
        int isEnd = 0;
        int remaining = target - tree.info;

        if (remaining == 0 && tree.left == null && tree.right == null) {
            isEnd = 1;
            return isEnd;
        }

        if (tree.left != null && isEnd != 1) {
            isEnd = findSum(tree.left, remaining, isEnd);
        }

        if (tree.right != null && isEnd != 1) {
            isEnd = findSum(tree.right, remaining, isEnd);
        }

        return isEnd;
    }
}