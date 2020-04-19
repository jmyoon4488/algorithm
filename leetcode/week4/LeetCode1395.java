package leetcode.week4;

import java.util.Arrays;

public class LeetCode1395 {
    /**
     * 1395. Count Number of Teams
     * https://leetcode.com/contest/weekly-contest-182/problems/count-number-of-teams/
     *
     * Example 1:
     * Input: rating = [2,5,3,4,1]
     * Output: 3
     * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1).
     *
     * Example 2:
     * Input: rating = [2,1,3]
     * Output: 0
     * Explanation: We can't form any team given the conditions.
     *
     * Example 3:
     * Input: rating = [1,2,3,4]
     * Output: 4
     * */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ret = CountNumberofTeams(arr);
        System.out.println(ret);
    }

    public static int CountNumberofTeams(int[] rating) {
        int count = 0;
        final int SOLDIERS_SIZE = 3;

        for (int i = 0; i < rating.length; i++) {
            for (int j = i+1; j < rating.length; j++) {
                for (int k = j+1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) count++;
                    if (rating[i] > rating[j] && rating[j] > rating[k]) count++;
                }
            }
        }
        
        return count;
    }
}
