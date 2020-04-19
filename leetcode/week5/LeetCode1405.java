package leetcode.week5;

import java.math.BigInteger;

public class LeetCode1405 {
    /**
     * 1405. Longest Happy String
     * https://leetcode.com/contest/weekly-contest-183/problems/longest-happy-string/
     *
     * Example 1:
     * Input: a = 1, b = 1, c = 7
     * Output: "ccaccbcc"
     * Explanation: "ccbccacc" would also be a correct answer.
     *
     * Example 2:
     * Input: a = 2, b = 2, c = 1
     * Output: "aabbc"
     *
     * Example 3:
     * Input: a = 7, b = 1, c = 0
     * Output: "aabaa"
     * Explanation: It's the only correct answer in this case.
     * */

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.longestDiverseString(1,1,7);
    }

    static class Solution {
        public String longestDiverseString(int a, int b, int c) {
            int[] count = {a,b,c};
            if (count[0] > count[1] && count[0] > count[2]) {

            } else if (count[1] > count[0] && count[1] > count[2]) {

            } else if (count[2] > count[0] && count[2] > count[1]) {

            }

            return "";
        }
    }
}


