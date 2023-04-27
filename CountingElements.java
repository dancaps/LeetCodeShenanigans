/**
 * Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. If there are duplicates in arr, count them separately.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * Example 2:
 *
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there is no 2, 4, 6, or 8 in arr.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 1000
 * 0 <= arr[i] <= 1000
 */

import java.util.HashSet;

public class CountingElements {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        // output is 3

        HashSet<Integer> hs = new HashSet<>();
        int answer = 0;

        for (int i: arr) {
            hs.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int compliment = arr[i] + 1;
            if (hs.contains(compliment)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
