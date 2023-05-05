package OneToTwenty;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
 * you have. Each character in stones is a type of stone you have. You want to know how many of the stones you
 * have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 *
 * Constraints:
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "zb";
        String stones = "ZZaAAbbbb";

        int answer = 0;
        HashSet<Character> jewelLookup = new HashSet<>();

        for (char jewel : jewels.toCharArray()) {
            jewelLookup.add(jewel);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelLookup.contains(stones.charAt(i))) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

/** Pseudocode
 * Map char, int jewelLookup = new HashMap
 * int answer
 *
 * for jewel in jewels
 *  add jewel to the lookup table
 *
 * for stone in stones
 *  if stone is in lookup
 *      answer++
 *
 * return answer
 *
 */
