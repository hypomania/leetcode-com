package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L5113 {
    public static void main(String[] args) {
        L5113 l5113 = new L5113();

        int[][] intervals = new int[][]{{0,5}};
        int[] toBeRemoved = new int[]{2,3};

        System.out.println(l5113.removeInterval(intervals, toBeRemoved));
    }

    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        List<List<Integer>> newL = new ArrayList<>(new ArrayList<>());
        for (int i=0; i< intervals.length; i++) {
            if ((intervals[i][0] < toBeRemoved[0] && toBeRemoved[0] < intervals[i][1]) &&
            (intervals[i][0] < toBeRemoved[1] && toBeRemoved[1] < intervals[i][1])) {
                newL.add(Arrays.asList(intervals[i][0], toBeRemoved[0]));
                newL.add(Arrays.asList(toBeRemoved[1], intervals[i][1]));
            } else if (intervals[i][0] < toBeRemoved[0] && toBeRemoved[0] < intervals[i][1]) {
                intervals[i][1] = toBeRemoved[0];
                newL.add(convertToList(intervals[i]));
            } else if (intervals[i][0] < toBeRemoved[1] && toBeRemoved[1] < intervals[i][1]) {
                intervals[i][0] = toBeRemoved[1];
                newL.add(convertToList(intervals[i]));
            } else if (toBeRemoved[0] < intervals[i][0] && toBeRemoved[1] > intervals[i][1]) {
                continue;
            } else {
                newL.add(convertToList(intervals[i]));
            }
        }

        return newL;
    }

    private List<Integer> convertToList(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            intList.add(i);
        }

        return intList;
    }
}
