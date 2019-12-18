package Leetcode;

import Graph.BinaryTree.BSTUtils;
import Graph.BinaryTree.BinarySearchTreeNode;
import Graph.BinaryTree.TreeNode;

public class L701 {

    public static void main(String[] args) {
        L701 l701 = new L701();


        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.right = new TreeNode(1);

        t1.right = new TreeNode(7);
        t1.left = t2;

        TreeNode result = l701.insertIntoBST(t1, 5);
        System.out.println(result);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        BSTUtils bstUtils = new BSTUtils();
        return bstUtils.insertIntoBST(root, val);
    }
}
