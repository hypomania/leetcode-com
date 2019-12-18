package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L5263 {

    public static void main(String[] args) {
        L5263 l5263 = new L5263();
        int[] list1 = new int[] {1,2,3};
        int[] list2 = new int[] {4,5,6};
        int[] list3 = new int[] {7,8,9};
        int[] list4 = new int[] {12,0,21,13};
        int[][] finalList = new int[][] {list1, list2, list3};

        System.out.println(l5263.shiftGrid(finalList, 9));
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (grid.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> listGrid = new ArrayList<>();
        for (int i = 0; i<grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<grid[i].length; j++) {
                row.add(j, grid[i][j]);
            }
            listGrid.add(row);
        }

        for (int i =0; i<k; i++) {
            listGrid = shiftOne(listGrid);
        }

        return listGrid;
    }

    public List<List<Integer>> shiftOne(List<List<Integer>> grid) {
        List<List<Integer>> newGrid = new ArrayList<>();
        int valueOnNextRow = grid.get(grid.size()-1).get(grid.get(grid.size()-1).size()-1);
        for (int i = 0; i<grid.size();i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j=0;j<grid.get(i).size();j++) {
                if (j==0) {
                    newRow.add(0, valueOnNextRow);
                }
                if (j == grid.get(i).size() - 1) {
                    valueOnNextRow = grid.get(i).get(j);
                } else {
                    newRow.add(j+1, grid.get(i).get(j));
                }
            }
            newGrid.add(i, newRow);
        }

        return newGrid;
    }
}
