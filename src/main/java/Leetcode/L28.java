package Leetcode;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class L28 {

    private ConcurrentHashMap<Integer, Integer> counters = new ConcurrentHashMap<>();

    private ArrayList<Character> needleChars = new ArrayList<>();

    public static void main(String[] args) {
        String h = "aaa";
        String n = "aaa";

        L28 l28 = new L28();

        System.out.println(l28.strStr(h, n));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for(char ch : needle.toCharArray()) {
            needleChars.add(ch);
        }

        int index = 0;
        for (char h : haystack.toCharArray()) {
            if (h == needleChars.get(0)) {
                counters.put(index, 0);
            }
            for (Map.Entry<Integer, Integer> x : counters.entrySet()) {
                if (x.getValue() == needleChars.size() -1) {
                    return x.getKey();
                }
                if(x.getKey() == index) {
                    continue;
                }
                if((x.getKey() + x.getValue()) == index - 1) {
                    if (h == needleChars.get(x.getValue()+1)) {
                        counters.put(x.getKey(), index - x.getKey());
                        if (counters.get(x.getKey()) == needleChars.size() -1) {
                            return x.getKey();
                        }
                    } else {
                        counters.put(x.getKey(), -1);
                    }
                }
            }

            index++;
        }

        return -1;
    }
}
