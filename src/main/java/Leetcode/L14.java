package Leetcode;

import java.util.ArrayList;

public class L14 {
    public static void main(String[] args) {
        L14 l14 = new L14();
        String[] res = {"flower","flow","flight"};
        System.out.println(l14.longestCommonPrefix(res));
    }

    public String longestCommonPrefix(String[] strs) {
        int j = 0;
        StringBuilder result = new StringBuilder();
        Character ch = null;
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() <= j) {
                    ch = null;
                    break;
                }
                if (ch == null) {
                    ch = strs[i].charAt(j);
                } else {
                    if (strs[i].charAt(j) != ch) {
                        ch = null;
                        break;
                    }
                }
            }
            if (ch == null) {
                break;
            }
            result.append(ch);
            ch = null;
            j++;
        }

        return result.toString();
    }
}
