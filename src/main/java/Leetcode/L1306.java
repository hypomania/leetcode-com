package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class L1306 {

    private ArrayList<Integer> minIndex = new ArrayList<>();
    private ArrayList<Integer> maxIndex = new ArrayList<>();
    private ConcurrentHashMap<Integer, Boolean> visited = new ConcurrentHashMap<Integer, Boolean>();
    private HashSet<Integer> visitedIndexSet = new HashSet<>();
    private HashSet<Integer> zeroIndexSet = new HashSet<>();

    private ConcurrentLinkedQueue<Integer> test = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        L1306 l1306 = new L1306();
        int[] res = {4,2,3,0,3,1,2};

        System.out.println(l1306.canReach(res, 3));
    }

    public boolean canReach(int[] arr, int start) {
        for (int i=0; i < arr.length; i++) {
            minIndex.add(i, i-arr[i]);
            maxIndex.add(i, i+arr[i]);
            visited.put(i, false);
            if (arr[i] == 0) {
                zeroIndexSet.add(i);
            }
        }
     //   visited.put(start, true);
       // visitedIndexSet.add(start);
        int index;
        test.add(start);
        while (test.peek() != null) {

            index = test.poll();
            if (visitedIndexSet.contains(index)) {
                continue;
            }
            visitedIndexSet.add(index);
            if (index < minIndex.size() && index >= 0) {
                int min1 = minIndex.get(index);
                if (!visitedIndexSet.contains(min1)) {
                    test.add(min1);
                }
                int max = maxIndex.get(index);
                if (!visitedIndexSet.contains(max)) {
                    test.add(max);
                }
            }
            if(zeroIndexSet.contains(index)) {
                return true;
            }
        }

        return false;
    }
}
