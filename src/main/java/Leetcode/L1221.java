package Leetcode;

public class L1221 {

    public static void main(String[] args) {
        L1221 l1221 = new L1221();

        String str = "";

        System.out.println(l1221.balancedStringSplit(str));
    }

    public int balancedStringSplit(String s) {
        int total = 0;
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'R') i++;
            if (ch == 'L') i--;
            if (i == 0) {
                total++;
            }
        }



        return total;
    }
}
