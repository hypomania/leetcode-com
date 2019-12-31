package Leetcode;

import java.util.Arrays;

public class L35 {

    public static void main(String[] args) {
        L35 l35 = new L35();
        int[] res = {1};
        System.out.println(l35.searchInsert(res, 1));
    }

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target <= nums[0]) {
                return 0;
            } else if (target > nums[0]) {
                return 1;
            }
        }

        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (true) {
            int middle = (lastIndex+firstIndex)/2;
            if (lastIndex == firstIndex) {
                return lastIndex;
            }
            if (Math.abs(lastIndex-firstIndex) <= 1) {
                if (nums[firstIndex] == target) {
                    return firstIndex;
                } else if (nums[lastIndex] == target) {
                    return lastIndex;
                } else if (nums[lastIndex] < target) {
                    return lastIndex + 1;
                } else if (nums[firstIndex] > target) {
                    return firstIndex == 0 ? 0 : firstIndex - 1;
                }
            }
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                if (lastIndex == middle) {
                    return lastIndex+1;
                }
                lastIndex = middle;
            } else {
                if (firstIndex == middle) {
                    return firstIndex+1;
                }
                firstIndex = middle;
            }
        }

    }
}
