package Leetcode;

import Graph.BinaryTree.TreeNode;
import Graph.DFS;

public class L104 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(20);
        t2.right = new TreeNode(7);
        t2.left = new TreeNode(15);
        t1.right = t2;
        t1.left = new TreeNode(9);

        L104 l104 = new L104();
        System.out.println(l104.maxDepth(t1));
    }

    public int maxDepth(TreeNode root) {
        DFS dfs = new DFS();
        dfs.dfs(root, 0);
        return dfs.maxDepth;
    }
}
