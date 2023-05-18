package TwentyOneToForty;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
 * the original letters exactly once.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Expected: true, Actual: " + solution("amagram", "magaram"));
    }

    public static boolean solution(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if (Arrays.equals(sArr, tArr)) {
            return true;
        }

        return false;
    }
}
/**
 convert the string to char arrays
 sort the arrays
 compare the arrays
 */
