package Leetcode;

import Graph.BinaryTree.TreeNode;

public class L101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean result = false;
        if (root.left != null && root.right != null) {
            result = isSymmetricStep(root.left, root.right);
        }

        return result;

    }

    private boolean isSymmetricStep(TreeNode left, TreeNode right) {
        boolean result = true;
        if (left.left != null && right.right != null) {
            result = result && isSymmetricStep(left.left, right.right);
        }
        if ((left.left == null && right.right != null) || (left.left != null && right.right == null)) {
            return false;
        }
        if (left.right != null && right.left != null) {
            result = result && isSymmetricStep(left.right, right.left);
        }
        if ((left.right == null && right.left != null) || (left.right != null && right.left == null)) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        } else {
            result = result && true;
        }

        return result;
    }
}
