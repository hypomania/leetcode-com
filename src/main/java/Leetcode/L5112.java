package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class L5112 {

    static HashMap<Character, String> charToString = new HashMap<>();

    static {
        charToString.put('0', "O");
        charToString.put('1', "I");
        charToString.put('a', "A");
        charToString.put('b', "B");
        charToString.put('c', "C");
        charToString.put('d', "D");
        charToString.put('e', "E");
        charToString.put('f', "F");
    }


    public static void main(String[] args) {
        String num = "747823223228";

        L5112 l5112 = new L5112();

        System.out.println(l5112.toHexspeak(num));
    }


    public String toHexspeak(String num) {
        Long x = Long.parseLong(num);
        String hexString = Long.toHexString(x);

        StringBuilder y = new StringBuilder();
        for (char ch : hexString.toCharArray()) {
            if (charToString.containsKey(Character.toLowerCase(ch))) {
                y.append(charToString.get(ch));
            } else {
                return "ERROR";
            }
        }

        return y.toString();
    }
}
