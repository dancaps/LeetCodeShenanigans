package TwentyOneToForty;

import java.util.*;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Expected: 3, Actual: " + findAnswer("abcabcbb")); // 3
        System.out.println("Expected: 2, Actual: " + findAnswer("au")); // 2
        System.out.println("Expected: 1, Actual: " + findAnswer("bbbbb")); // 1
        System.out.println("Expected: 3, Actual: " + findAnswer("pwwkew")); // 3
        System.out.println("Expected: 1, Actual: " + findAnswer(" ")); // 1
        System.out.println("Expected: 2, Actual: " + findAnswer("aab")); // 2
    }

    private static int findAnswer(String s) {

        Set<Character> characters = new HashSet<>();
        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            if (!characters.contains(s.charAt(right))) {
                characters.add(s.charAt(right));
                answer = Math.max(answer, right - left + 1);
            } else {

                while (left < right && s.charAt(left) != s.charAt(right)) {
                    characters.remove(s.charAt(left++));
                }
                left++;
            }
        }

        return answer;
    }
}

/** Pseudocode
 * input = "abccbcbb"
 *
 * HashSet to hold characters
 * int left = 0;
 * int answer = 0;
 *
 * move right with a for loop
 *  if the char is not in the HS
 *      add it to the hashset
 *      update answer = Math.max(answer, right - left + 1)
 *
 *  if char is in the hashset // that means there is a duplicate
 *      while left is less than right and the current char is not equal to the left char
 *          remove the left char
 *          update left
 *
 *      remove the left char from the hashset
 *      move the left pointer to the right
 *      add the right pointer to the hm
 *
 *  return answer
 */