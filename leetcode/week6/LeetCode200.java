package leetcode.week6;

public class LeetCode200 {
    /**
     * 200. Number of Islands
     * https://leetcode.com/problems/number-of-islands/
     *
     * Example 1:
     * Input:
     * 11110
     * 11010
     * 11000
     * 00000
     * Output: 1
     *
     * Example 2:
     * Input:
     * 11000
     * 11000
     * 00100
     * 00011
     * Output: 3
     * */

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] map = new char[4][5];
        map[0] = new char []{'1','1','0','0','0'};
        map[1] = new char []{'1','1','0','0','0'};
        map[2] = new char []{'0','0','1','0','0'};
        map[3] = new char []{'0','0','0','1','1'};
        int result = solution.numIslands(map);
        System.out.println(result);
    }

    static class Solution {
        public int numIslands(char[][] grid) {



            for (char[] clist : grid) {
                for (char c : clist) {
                    System.out.println(c);
                }
            }
            return 0;
        }
    }

}
