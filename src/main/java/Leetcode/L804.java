package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class L804 {

    String[] allLetters = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) {
        L804 l804 = new L804();
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(l804.uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> all = new HashSet();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char ch : word.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    int val = ch -97;
                    morse.append(allLetters[val]);
                } else {
                    int val = ch -65;
                    morse.append(allLetters[val]);
                }
            }
            all.add(morse.toString());
        }

        return all.size();
    }
}
