package leetcode.week4;

public class LeetCode1397 {
    /**
     * 1397. Find All Good Strings
     * https://leetcode.com/contest/weekly-contest-182/problems/find-all-good-strings/
     *
     * Example 1:
     * Input: n = 2, s1 = "aa", s2 = "da", evil = "b"
     * Output: 51
     * Explanation: There are 25 good strings starting with 'a': "aa","ac","ad",...,"az". Then there are 25 good strings starting with 'c': "ca","cc","cd",...,"cz" and finally there is one good string starting with 'd': "da".
     *
     * Example 2:
     * Input: n = 8, s1 = "leetcode", s2 = "leetgoes", evil = "leet"
     * Output: 0
     * Explanation: All strings greater than or equal to s1 and smaller than or equal to s2 start with the prefix "leet", therefore, there is not any good string.
     *
     * Example 3:
     * Input: n = 2, s1 = "gx", s2 = "gz", evil = "x"
     * Output: 2
     * */

    public static void main(String[] args) {

        int n = 2;
        String s1 = "aa", s2 = "da", evil = "b";
        Solution solution = new Solution();
        solution.findGoodStrings(n, s1, s2, evil);

    }

    static class Solution {
        public int findGoodStrings(int n, String s1, String s2, String evil) {
            return 0;
        }
    }
}


