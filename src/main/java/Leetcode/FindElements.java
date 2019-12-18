package Leetcode;

import Graph.BinaryTree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class FindElements {


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(-1);
        TreeNode t2 = new TreeNode(-1);
        TreeNode t3 = new TreeNode(-1);
        t1.right = t2;
        t1.left = t3;
        t3.left = new TreeNode(-1);
        t3.right = new TreeNode(-1);

        FindElements findElements = new FindElements(t1);
        System.out.println(findElements.find(1));
        System.out.println(findElements.find(3));
        System.out.println(findElements.find(5));
    }

    Set<Integer> presented = new HashSet<>();

    public FindElements(TreeNode root) {
        if (root != null) {
            root.val = 0;
            presented.add(0);
            this.setValue(root);
        }
    }

    private TreeNode setValue(TreeNode root) {
        if (root.left != null) {
            root.left.val = 2 * root.val + 1;
            setValue(root.left);
            presented.add(root.left.val);
        }
        if (root.right != null) {
            root.right.val = 2 * root.val + 2;
            setValue(root.right);
            presented.add(root.right.val);
        }

        return root;
    }

    public boolean find(int target) {
        return presented.contains(target);
    }
}
