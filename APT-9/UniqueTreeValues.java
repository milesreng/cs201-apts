import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        int[] leftVals = unique(root.left);
        int[] rightVals = unique(root.right);

        Set<Integer> retSet = new HashSet<>();
        retSet.add(root.info);

        for (int i = 0; i < leftVals.length; i++) {
            retSet.add(leftVals[i]);
        }

        for (int i = 0; i < rightVals.length; i++) {
            retSet.add(rightVals[i]);
        }

        int[] ret = new int[retSet.size()];
        int i = 0;
        for (Integer val : retSet) {
            ret[i] = val;
            i++;
        }

        Arrays.sort(ret);

        return ret;
    }
}