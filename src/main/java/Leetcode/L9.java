package Leetcode;

import Number.IntegerUtils;


public class L9 {
    public static void main(String[] args) {
        int[] array = new int[]{-10,-3,0,5,9};

        L9 l9 = new L9();
        System.out.println(l9.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        return IntegerUtils.isPalindrome(x);
    }

}
