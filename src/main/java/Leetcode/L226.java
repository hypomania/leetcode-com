package Leetcode;

import Graph.BinaryTree.TreeNode;

public class L226 {
    public static void main(String args[]) {
        TreeNode x = new TreeNode(4);
        TreeNode l = new TreeNode(2);
        l.left = new TreeNode(1);
        l.right = new TreeNode(3);
        TreeNode r = new TreeNode(7);
        r.left = new TreeNode(6);
        r.right = new TreeNode(9);
        x.left = l;
        x.right = r;

        L226 l226 = new L226();
        System.out.println(l226.invertTree(x));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode x = root.left;
        root.left = root.right;
        root.right = x;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
