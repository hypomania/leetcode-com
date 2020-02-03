package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class L1106 {

    Deque<Character> queue = new ArrayDeque<>();
    Deque<Boolean> sub = new ArrayDeque<>();

    public static void main(String...args) {

        L1106 l1106 = new L1106();

        String expr = "|(&(t,f,t),!(t))";

        System.out.println(l1106.parseBoolExpr(expr));
    }

    public boolean parseBoolExpr(String expression) {
        for (Character characters : expression.toCharArray()) {
            if (characters != ')') {
                queue.addLast(characters);
            } else {
                while (queue.peekLast() != '(' && queue.peekLast() != null) {
                    Character bool = queue.pollLast();
                    if (bool == 'f') {
                        sub.addLast(false);
                    } else if (bool == 't') {
                        sub.addLast(true);
                    } else if (bool == ',') {
                        continue;
                    }
                }
                queue.pollLast();
                Character operation = queue.pollLast();
                Boolean result = false;
                Boolean first = false;
                if (operation == '&') {
                    first = sub.pollLast();
                    while (sub.peekLast() != null) {
                        first = sub.pollLast() && first;
                    }
                    queue.add(convertToChar(first));
                } else if (operation == '|') {
                    first = sub.pollLast();
                    while (sub.peekLast() != null) {
                        first = sub.pollLast() || first;
                    }
                    queue.add(convertToChar(first));
                } else if (operation == '!') {
                    first = sub.removeLast();
                    queue.add(convertToChar(!first));
                }

            }
        }

        return (queue.poll() == 't') ? true : false;
    }

    private Character convertToChar(Boolean b) {
        if (b == true) {
            return 't';
        }
        return 'f';
    }
}
