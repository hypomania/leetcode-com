package Leetcode;

import Graph.BinaryTree.TreeNode;

public class L110 {

    public static void main(String[] args) {
//        TreeNode tree = new TreeNode(3);
//        tree.left = new TreeNode(9);
//
//        TreeNode right = new TreeNode(20);
//        right.right = new TreeNode(7);
//        right.left = new TreeNode(15);
//
//        tree.right = right;


        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);

        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(15);
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(4);
        a.right = new TreeNode(4);

        tree.left.right = a;



        L110 l110 = new L110();

        System.out.println(l110.isBalanced(tree));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        }

        if ((height(root.left) - height(root.right) >= -1) &&
                (height(root.left) - height(root.right) <= 1)) {
            return true;
        }

        return false;
    }

    private int height(TreeNode t) {
        if (t == null) {
            return 0;
        }
        return 1+Math.max(height(t.left), height(t.right));
    }
}
