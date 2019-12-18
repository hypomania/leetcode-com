package Leetcode;

import Graph.BinaryTree.BalancedTreeNode;
import Graph.BinaryTree.TreeNode;

public class L108 {
    public static void main(String[] args) {
       // int[] array = new int[]{-10,-3,0,5,9};
        int[] array = new int[]{0,1,2,3,4,5,6};

        L108 l108 = new L108();
        TreeNode x = l108.sortedArrayToBST(array);
        System.out.println(x);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        BalancedTreeNode node = new BalancedTreeNode(nums[0]);
        for (int i =1; i< nums.length; i++) {
            node = node.insert(node, nums[i]);
        }

        return node;
    }
}
