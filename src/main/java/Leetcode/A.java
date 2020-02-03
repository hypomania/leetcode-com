package Leetcode;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class A {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        HashSet<Integer> ss = new HashSet<>();
        ss.add(66);
        ss.add(8);
        ss.add(9);
        ss.add(10);
        ss.add(1);
        ss.add(3);
        ss.add(2);

        for (Integer a : ss) {
            System.out.println(a + ",");
        }
    }
}
