import java.util.*;

public class LeafTrails {
    public String[] trails(TreeNode tree) {
        if (tree == null) {
            return new String[0];
        }
        Map<String, String> paths = new TreeMap<>();
        paths = encode(tree, "", paths);
        

        String[] allPaths = new String[paths.size()];
        int i = 0;
        for (String val : paths.values()) {
            allPaths[i] = val;
            i++;
        }
        return allPaths;
    }

    public Map<String, String> encode(TreeNode tree, String path, Map<String, String> allPaths) {
        if (tree.left == null && tree.right == null) {
            allPaths.put(String.valueOf(tree.info), path);
        }

        if (tree.left != null) {
            encode(tree.left, path + "0", allPaths);
        }

        if (tree.right != null) {
            encode(tree.right, path + "1", allPaths);
        }

        return allPaths;
    }
}