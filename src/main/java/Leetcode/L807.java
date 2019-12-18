package Leetcode;

public class L807 {

    public static void main(String[] args) {
        L807 l807 = new L807();

        int[][] buildings = new int[][]{{3,0,8,4},{2,4,5,7}, {9,2,6,3}, {0,3,1,0}};

        System.out.println(l807.maxIncreaseKeepingSkyline(buildings));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        if (grid.length == 0) {
            return 0;
        }
        int result = 0;

        int widht = grid.length;
        int height = grid[0].length;
        int[] widthMaxHeight = new int[widht];
        int[] heightMaxHeight = new int[height];


        for (int i = 0; i< grid.length; i++) {
            for (int j=0; j< grid[i].length; j++) {
                if (grid[i][j] > widthMaxHeight[i]) {
                    widthMaxHeight[i] = grid[i][j];
                }
                if (grid[i][j] > heightMaxHeight[j]) {
                    heightMaxHeight[j] = grid[i][j];
                }
            }
        }


        for ( int i = 0; i< widht; i++) {
            for (int j=0;j<height;j++) {
                int notBiggerThan = Math.min(widthMaxHeight[i], heightMaxHeight[j]);
                if (grid[i][j] < notBiggerThan) {
                    result = result + notBiggerThan - grid[i][j];
                }
            }
        }

        return result;

    }
}
