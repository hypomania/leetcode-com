package Leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L5265 {
    public static void main(String[] args) {
        L5265 l5265 = new L5265();
        int[] nums1 = {3, 6, 5, 1, 8};
    //    l5265.maxSumDivThree(nums1);
    }

//    public int maxSumDivThree(int[] nums) {
//        Arrays.sort(nums);
//
//        int sum = 0;
//        for (int i = 0; i<nums.length; i++) {
//            sum += nums[i];
//        }
//
//        if (sum % 3 == 0) {
//            return sum;
//        } else {
//            List<Integer> res = Arrays.stream(nums)
//                    .boxed()
//                    .collect(Collectors.toList());
//         //   test(res, sum);
//        }
//    }

//    public int test(List<Integer> nums, int sum) {
//        for (int i = 0; i<nums.size(); i++) {
//            sum -= nums.get(i);
//            nums.remove(i);
//        }
//    }
}
