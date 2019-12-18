package Leetcode;

public class L1021 {


    public static void main(String[] args) {
        L1021 l1021 = new L1021();
        System.out.println(l1021.removeOuterParentheses("(()())(())(()(()))"));
    }

    public String removeOuterParentheses(String S) {
        int i = 0;
        StringBuilder f = new StringBuilder();
        for (char ch : S.toCharArray() ) {
            if (ch == '(') {
                i++;
            }
            if (i > 1) {
                f.append(ch);
            }
            if (ch == ')') {
                i--;
            }
        }

        return f.toString();
    }

}
