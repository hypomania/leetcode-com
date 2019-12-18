package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L5109 {

    HashMap<String, List<String>> mapOfSets;

    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {

        DisJointSets djs = new DisJointSets();
        for (int i = regions.size(); i-- > 0; ) {

            djs.addNewSet(regions.get(i));
        }

        List<String> firstList = djs.findListOfParents(region1);

        String result = djs.findFirst(region2);

        return result;


    }
}

//class DisJointSets {
//
//    HashMap<String, String> parents = new HashMap<String, String>();
//
//    List<String> currentParentList = new ArrayList<>();
//
//    public void addNewSet(List<String> newSet) {
//        for (int i = 0; i< newSet.size(); i++) {
//         //   if (!parents.containsKey(newSet.get(i))) {
//                parents.put(newSet.get(i), newSet.get(0));
//        //    }
//        }
//    }
//
//    // find representative
//    String find(String x) {
//        if (!parents.get(x).equals(x)) {
//            parents.put(x, find(parents.get(x)));
//        }
//
//        return parents.get(x);
//    }
//
//    List<String> findListOfParents(String x) {
//        currentParentList.add(x);
//        if (!parents.get(x).equals(x)) {
//            findListOfParents(parents.get(x));
//        }
//
//        return currentParentList;
//    }
//
//    String findFirst(String x) {
//        if (!currentParentList.contains(x)) {
//            return findFirst(parents.get(x));
//        }
//
//        return x;
//    }
//
//    void union(String a, String b) {
//        String aRoot = find(a);
//        String bRoot = find(b);
//
//        if (aRoot == bRoot)
//            return;
//
//        parents.put(bRoot, aRoot);
//
//    }
//}
