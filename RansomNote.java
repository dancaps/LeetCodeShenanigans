import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";

        Map<Character, Integer> mag = new HashMap<>();
        Map<Character, Integer> note = new HashMap<>();
        char[] cMag = magazine.toCharArray();
        char[] cNote = ransomNote.toCharArray();

        for (char c : cMag) {
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }

        for (char c : cNote) {
            note.put(c, note.getOrDefault(c, 0) + 1);
        }

        System.out.println(Arrays.toString(cMag));
        System.out.println(Arrays.toString(cNote));
        System.out.println(mag);
        System.out.println(mag.getOrDefault('a', 0));

        for (char c : cNote) {
            if (mag.getOrDefault(c, 0) < note.get(c)) {
                System.out.println("False");
            }
        }

        // this would be a return statement
        System.out.println("True");
    }
}

/** Pseudocode
 * Create a hashmap that holds the count of the letters in magazine
 * Create a hashmap that holds the count of the letters in ransom note
 * char[] cNote = ransom.toCharArray()
 * char[] cMag = ransom.toCharArray()
 *
 * loop both cNote and cMag to count them
 *
 * for each char in cNote
 *  if the value of char in mag HM is < value of char in ransom HM
 *      return false
 *
 *  return true
 */
