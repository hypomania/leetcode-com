package Leetcode.L997;

import java.util.ArrayList;

public class L997 {
    public static void main(String[] args) {

        int[][] res = {{1,3},{2, 3}, {2,3}};

        L997 l997 = new L997();
        System.out.println(l997.findJudge(3, res));

    }

    public int findJudge(int N, int[][] trust) {
        ArrayList<Integer> citizens = new ArrayList(N);
        for (int i=0; i<N; i++) {
            citizens.add(i, 0);
        }
        for (int i=0; i< trust.length; i++) {
            if (trust[i][0] == trust[i][1]) {
                citizens.set(trust[i][0] - 1, -1);
            } else {
                citizens.set(trust[i][0] - 1, -1);
                citizens.set(trust[i][1] - 1, citizens.get(trust[i][1] - 1)+ 1);
            }
        }
        if (!citizens.contains(N-1)) {
            return -1;
        } else {
            return citizens.lastIndexOf(N-1) + 1;
        }
    }
}
