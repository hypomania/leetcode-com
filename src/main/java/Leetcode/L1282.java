package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1282 {


    public static void main(String[] args) {
        L1282 l1282 = new L1282();
        int[] arr = new int[]{3,3,3,3,3,1,3};

        System.out.println(l1282.groupThePeople(arr));

    }

    ArrayList<Integer> groupList = new ArrayList();

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Arrays.sort(groupSizes);
      //  ArrayList xx = new ArrayList(groupSizes);
       // Arrays.sortBy

        int groupSizeIndex = 0;
        ArrayList result = new ArrayList();
        ArrayList<Integer> currentIteration = new ArrayList<>();
        groupList.add(0,0);
        for(int i = 0; i < groupSizes.length; i++) {
            int element = groupList.get(groupSizeIndex) + 1;
            groupList.set(groupSizeIndex, element);
            currentIteration.add(i);


            if (groupList.get(groupSizeIndex) == groupSizes[i]) {
                result.add(groupSizeIndex, currentIteration);
                groupSizeIndex++;
                groupList.add(groupSizeIndex,0);
                currentIteration = new ArrayList<>();
            }
        }
        return result;
    }
}
