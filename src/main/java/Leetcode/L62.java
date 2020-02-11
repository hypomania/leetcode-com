package Leetcode;

import java.util.HashMap;

public class L62 {
    HashMap<Integer, HashMap<Integer, Integer>> cache = new HashMap<>();

    public static void main(String[] args) {
        L62 l62 = new L62();

        System.out.println(l62.uniquePaths(23,12));
    }

    public int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 2 && n == 1) return 1;
        if (m == 1 && n == 2) return 1;

        if (cache.get(m) != null && cache.get(m).get(n) != null) {
            return cache.get(m).get(n);
        }

        int result = 0;
        for (int i = m; i > 1; i++) {
            for (int j = n; i > 1; i++) {
                result = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
            }
        }

        int result = 1;
        if (m == 1) {
            result = uniquePaths(m, n-1);
        } else if (n == 1) {
            result = uniquePaths(m-1, n);
        } else {
            result = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
        HashMap<Integer, Integer> temp = new HashMap<>();
        temp.put(n, result);
        cache.put(m, temp);
        return result;
    }
}
