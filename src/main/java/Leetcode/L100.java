package Leetcode;

import Graph.BinaryTree.TreeNode;

import java.util.HashMap;

public class L100 {
    HashMap<TreeNode, Boolean> visited = new HashMap<TreeNode, Boolean>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
//        if (visited.get(p)) {
//
//        }
        boolean result = true;
    //    visited.put(p, true);
        if (p.left != null || q.left != null) {
            result = isSameTree(p.left, q.left);
            if (!result) {
                return false;
            }
        }
        if (p.right != null || q.left != null) {
            result = isSameTree(p.right, q.right);

            if (!result) {
                return false;
            }
        }
        if (p.val == q.val) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
