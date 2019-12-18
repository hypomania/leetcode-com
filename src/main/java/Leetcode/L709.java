package Leetcode;

public class L709 {

    public static void main(String[] args) {
        L709 l709 = new L709();
        System.out.println(l709.toLowerCase("Test"));
    }

    public String toLowerCase(String str) {
        StringBuilder newStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if ((int)ch <= 90 && (int)ch >= 65) {
                newStr.append((char)(ch+32));
            } else {
                newStr.append(ch);
            }
        }

        return newStr.toString();
    }
}
