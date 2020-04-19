package leetcode.week4;

import java.util.*;

public class LeetCode1394 {
    /**
     * 1394. Find Lucky Integer in an Array
     * https://leetcode.com/contest/weekly-contest-182/problems/find-lucky-integer-in-an-array/
     *
     * Example 1:
     * Input: arr = [2,2,3,4]
     * Output: 2
     * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
     *
     * Example 2:
     * Input: arr = [1,2,2,3,3,3]
     * Output: 3
     * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
     *
     * Example 3:
     * Input: arr = [2,2,2,3,3]
     * Output: -1
     * Explanation: There are no lucky numbers in the array.
     *
     * Example 4:
     * Input: arr = [5]
     * Output: -1
     *
     * Example 5:
     * Input: arr = [7,7,7,7,7,7,7]
     * Output: 7
     * */

    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        int ret = findLucky(arr);
        System.out.println(ret);
    }

    public static int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max = -1;
        int currentNum = 0;
        int count = 0;
        for (int num : arr) {
            if (currentNum != num) {
                if (currentNum == count) {
                    max = Math.max(max, count);
                }
                currentNum = num;
                count = 1;
                continue;
            }
            count++;
        }
        if (currentNum != count) count = -1;
        max = Math.max(max, count);
        if (max == 0) return -1;
        return max;
    }
}
