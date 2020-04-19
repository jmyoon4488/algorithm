package leetcode.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode1403 {
    /**
     * 1403. Minimum Subsequence in Non-Increasing Order
     * https://leetcode.com/contest/weekly-contest-183/problems/minimum-subsequence-in-non-increasing-order/
     *
     * Example 1:
     * Input: nums = [4,3,10,9,8]
     * Output: [10,9]
     * Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included, however, the subsequence [10,9] has the maximum total sum of its elements.
     *
     * Example 2:
     * Input: nums = [4,4,7,6,7]
     * Output: [7,7,6]
     * Explanation: The subsequence [7,7] has the sum of its elements equal to 14 which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. Note the subsequence has to returned in non-decreasing order.
     *
     * Example 3:
     * Input: nums = [6]
     * Output: [6]
     * */

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.minSubsequence(new int[]{4, 3, 10, 9, 8});

    }

    static class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            Arrays.sort(nums);
            int sum = Arrays.stream(nums).sum();
            int size = nums.length;
            int subSum = 0;
            System.out.println(sum);
            List<Integer> retList = new ArrayList<>();

            for (int i = size - 1; i >= 0; i--) {
                subSum += nums[i];
                retList.add(nums[i]);
                if (subSum > (sum - subSum)) {
                    break;
                }
            }
            return retList;
        }
    }
}


