import Graph.AdjacencyMatrix;
import Graph.BinaryTree.TreeNode;
import Leetcode.L100;
import Leetcode.L101;
import Leetcode.L5109;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        L101 l100 = new L101();
//        TreeNode t1 = new TreeNode(2);
//        TreeNode t2 = new TreeNode(3);
//        TreeNode t3 = new TreeNode(3);
//      //  t1.right = t2;
//      //  t1.left = t3;

        L5109 l5109 = new L5109();
        List<String> list1 = Arrays.asList("Earth","North America","South America");
        List<String> list2 = Arrays.asList("North America","United States","Canada");
        List<String> list3 = Arrays.asList("United States","New York","Boston");
        List<String> list4 = Arrays.asList("Canada","Ontario","Quebec");
        List<String> list5 = Arrays.asList("South America","Brazil");

        List<List<String>> result = Arrays.asList(list1,list2, list3, list4, list5);

        System.out.println(l5109.findSmallestRegion(result, "Quebec", "New York"));
    }
}
