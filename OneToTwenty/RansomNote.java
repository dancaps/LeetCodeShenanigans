package OneToTwenty;

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

        for (int i = 0; i < magazine.length(); i++) {
            mag.put(magazine.charAt(i), mag.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            if (mag.getOrDefault(key, 0) < 1) {
                System.out.println("False"); // this would be a return
                break; // this would not be here
            }
            mag.replace(key, mag.get(key) - 1);
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
