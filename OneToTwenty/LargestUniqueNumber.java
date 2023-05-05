package OneToTwenty;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,3,9,4,9,8,3,1]
 * Output: 8
 * Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.
 * Example 2:
 *
 * Input: nums = [9,9,8,8]
 * Output: -1
 * Explanation: There is no number that occurs only once.
 *
 */

public class LargestUniqueNumber {
    public static void main(String[] args) {
        int[] nums = {5,7,3,9,4,9,8,3,1};

        Map<Integer, Integer> count = new HashMap<>();
        int answer = -1;

        for (int num : nums) {
           count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> num : count.entrySet()) {
            if (num.getValue() == 1 && num.getKey() > answer) {
                answer = num.getKey();
            }
        }

        System.out.println(count);
        System.out.println(answer);;
    }
}

/** Pseudocode
 * create a hashmap to hold the counts.
 * int answer = -1
 *
 * loop the nums array
 *  count all the integer putting them in the map
 *
 * loop the map
 *  if entry is > answer and entry == 1
 *      update answer
 *
 *  return answer
 */