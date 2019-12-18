package Leetcode;

import java.util.HashMap;

public class L771 {


    public static void main(String[] args) {
        L771 l771 = new L771();
        System.out.println(l771.numJewelsInStones("aA", "aAAbbbcb"));
    }

    HashMap<Character, Boolean> charExists = new HashMap<>();

    public int numJewelsInStones(String J, String S) {
        for (char a : J.toCharArray()) {
            charExists.put(a, true);
        }

        int count = 0;
        for (char b : S.toCharArray()) {
            if (charExists.containsKey(b)) {
                count++;
            }
        }

        return count;
    }
}
