package OneToTwenty;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println("Expected: true, Actual: " + solution(new int[]{1, 2, 3, 1}));
        System.out.println("Expected: false, Actual: " + solution(new int[]{1,2,3,4}));
        System.out.println("Expected: true, Actual: " + solution(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean solution(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.contains(nums[i])) {
                return true;
            }
            values.add(nums[i]);
        }
        return false;
    }
}

/** Pseudocode
 * Create a Set to store numbers
 * loop the numbers in the nums array
 *  check if the number is in the set
 *      if true
 *          return true
 *      else
 *          add the number to the set
 * return false
 */
