package TwentyOneToForty;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 *
 * Return the sum of all the unique elements of nums.
 *
 * Example 1:
 * Input: nums = [1,2,3,2]
 * Output: 4
 * Explanation: The unique elements are [1,3], and the sum is 4.
 *
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: There are no unique elements, and the sum is 0.
 *
 * Example 3:
 * Input: nums = [1,2,3,4,5]
 * Output: 15
 * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class SumOfUniqueElements {

    public static void main(String[] args) {
        System.out.println("Expected: 4, Actual: " + solution(new int[]{1, 2, 3, 2}));
        System.out.println("Expected: 0, Actual: " + solution(new int[]{1, 1, 1, 1, 1}));
        System.out.println("Expected: 15, Actual: " + solution(new int[]{1, 2, 3, 4, 5}));
    }

    public static int solution(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        int answer = 0;
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (int key : count.keySet()) {
            if (count.get(key) == 1) {
                answer += key;
            }
        }

        return answer;
    }
}

/** Pseudocode
 * create a hashmap that holds the count of each number
 * int answer = 0
 * fill the hm
 *
 * loop the hm and add values which = 1
 *
 * return answer
 */