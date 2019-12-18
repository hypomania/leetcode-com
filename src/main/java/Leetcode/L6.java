package Leetcode;

import java.util.ArrayList;

public class L6 {
    public static void main(String[] args) {
        L6 l6 = new L6();
        System.out.println(l6.convert("PAHNAPLSIIGYIR", 3));
    }

    public String convert(String s, int numRows) {
        StringBuilder[] strs = new StringBuilder[4];
        char[] chars = s.toCharArray();
        int r = numRows + numRows -1;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || i % r == 0) {
                strs[0].append(chars[i]);
            } else {

            }
        }

        return strs[0].toString();
    }
}
