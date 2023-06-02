package FortyOneToSixty;

/**
 * Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of
 * integers that are present in each array of nums sorted in ascending order.
 *
 * Example 1:
 * Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
 * Output: [3,4]
 * Explanation:
 * The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3
 * and 4, so we return [3,4].
 *
 * Example 2:
 * Input: nums = [[1,2,3],[4,5,6]]
 * Output: []
 * Explanation:
 * There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
 */

import java.util.*;

public class IntersectionOfMultipleArrays {

    public static void main(String[] args) {
        int[][] array1 = new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println("Expected: [3,4], Actual: " + solution(array1));

        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        System.out.println("Expected: [], Actual: " + solution(array2));
    }

    public static List solution(int[][] nums) {

        Map<Integer, Integer> counter = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int k = 0; k < nums[i].length; k++) {
                counter.put(nums[i][k], counter.getOrDefault(nums[i][k], 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if(entry.getValue() == nums.length) {
                answer.add(entry.getKey());
            }
        }

        Collections.sort(answer);

        return answer;
    }
}
/**
 *  Pseudocode
 *
 *  create a hashset HM
 *  create an answer list answer
 *
 *  loop the outer array
 *     loop the inner array
 *         add the number to the HM <key=num, value=counter>
 *
 *  loop the HM values
 *     if the value is > outer.length
 *     push to answer list
 *
 *  sort answer list
 */