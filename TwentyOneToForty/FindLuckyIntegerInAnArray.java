package TwentyOneToForty;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
 * Return the largest lucky integer in the array. If there is no lucky integer return -1.
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
 * Constraints:
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 */
public class FindLuckyIntegerInAnArray {

    public static void main(String[] args) {
        System.out.println("Expected: 2, Actual: " + solution(new int[]{2, 2, 3, 4}));
        System.out.println("Expected: 3, Actual: " + solution(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println("Expected: -1, Actual: " + solution(new int[]{2, 2, 2, 3, 3}));
        System.out.println("Expected: 3, Actual: " + solution(new int[]{2, 2, 2, 3, 3, 100, 100, -2, -2, -2, -2, 3}));
    }

    public static int solution(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int answer = -1;

        for (int i : arr) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        for (int i : count.keySet()) {
            if (i == count.get(i) && i > answer) {
                answer = i;
            }
        }

        return answer;
    }
}

/** Pseudocode
 * create a hashmap to count the number of times the number appears
 * int answer
 * count the numbers with a for loop
 *
 * loop the keys
 *  if the key and value are equal
 *      check answer to see if it's bigger
 *
 * return answer
 */
