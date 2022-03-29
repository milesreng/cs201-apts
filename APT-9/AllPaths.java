import java.util.*;

public class AllPaths {
    List<String> list = new ArrayList<>();

    public String[] paths(TreeNode t) {
        findPath(t, "");
        String[] ret = new String[list.size()];
        int i = 0;
        for (String s : list) {
            ret[i] = s;
            i++;
        }
        Arrays.sort(ret);
        return ret;
    }

    public void findPath(TreeNode t, String path) {
        if (t == null) {
            return;
        }

        if (path.isEmpty()) {
            path = "" + t.info;
        } else {
            path += "->" + t.info;
        }

        if (t.left == null && t.right == null) {
            list.add(path);
            return;
        }

        findPath(t.left, path);
        findPath(t.right, path);
    }
}