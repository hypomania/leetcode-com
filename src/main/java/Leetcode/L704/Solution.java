package Leetcode.L704;

public class Solution {

	public static void main(String... args) {
		System.out.println(search(new int[]{-1, 0, 5}, -1));
	}

	public static int search(int[] nums, int target) {
		int result = -1;
		int start = 0;
		int end = nums.length - 1;
		int previousStart = -1;
		int previousEnd = -1;

		while (end - start >= 0) {
			int middle = (end - start) / 2 + start;
			if (previousStart == start && previousEnd == end) {
				return result;
			}
			previousStart = start;
			previousEnd = end;
			if (target == nums[middle]) {
				return middle;
			} else if (target < nums[middle]) {
				end = middle < end ? middle : end - 1;
			} else {
				start = middle > start ? middle : start + 1 ;
			}
		}

		return result;
	}
}
