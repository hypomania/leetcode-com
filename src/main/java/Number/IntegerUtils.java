package Number;

public class IntegerUtils {

    public static boolean isPalindrome(int primary) {
        if (primary < 0) {
            return false;
        } else if (primary > 0 && primary < 10) {
            return true;
        }
        Integer number = (Integer) primary;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse*10 + digit;
            number = number/10;
        }

        if (primary == reverse) {
            return true;
        }

        return false;
    }
}
