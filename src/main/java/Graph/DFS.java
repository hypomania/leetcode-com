package Graph;

import Graph.BinaryTree.TreeNode;

import java.util.HashMap;

public class DFS {

    HashMap<TreeNode, Boolean> visited = new HashMap<>();

    public int maxDepth = 0;

    public DFS() {
    }

    public void dfs(TreeNode node, int depth) {
        if (node == null) {
            if (depth > maxDepth) maxDepth = depth;
            return;
        }
        visited.put(node, true);

        depth++;
        if (!visited.containsKey(node.left)) {
            dfs(node.left, depth);
        }
        if (!visited.containsKey(node.right)) {
            dfs(node.right, depth);
        }
    }
}
