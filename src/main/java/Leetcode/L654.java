package Leetcode;

import Graph.BinaryTree.TreeNode;

import java.util.Arrays;

public class L654 {


    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,6,0,5};

        L654 l654 = new L654();
        TreeNode xx = l654.constructMaximumBinaryTree(arr);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        TreeNode xx = new TreeNode(max);
        xx.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0, maxIndex));
        xx.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxIndex+1, nums.length));

        return xx;
    }
}
