import java.util.HashMap;
import java.util.Map;

/**
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 *
 * Example 1:
 * Input: text = "nlaebolko"
 * Output: 1
 *
 * Example 2:
 * Input: text = "loonbalxballpoon"
 * Output: 2
 *
 * Example 3:
 * Input: text = "leetcode"
 * Output: 0
 */

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        //String text = "leetcode";

        Map<Character, Integer> count = new HashMap<>();
        char[] inputText = text.toCharArray();
        int answer = 0;

        for (char letter : inputText) {
            count.put(letter, count.getOrDefault(letter, 0) + 1);
        }

        // version 1 before seeing the solution
//        while (count.getOrDefault('b', 0) > 0 && count.getOrDefault('a', 0) > 0 &&
//                count.getOrDefault('l', 0) > 1 && count.getOrDefault('o', 0) > 1 &&
//                count.getOrDefault('n', 0) > 0) {
//            System.out.println(count);
//            answer++;
//            count.put('b', count.get('b') - 1);
//            count.put('a', count.get('a') - 1);
//            count.put('l', count.get('l') - 2);
//            count.put('o', count.get('o') - 2);
//            count.put('n', count.get('n') - 1);
//        }

        // version 2 optimization
        answer = Math.min(count.getOrDefault('b', 0), count.getOrDefault('a', 0));
        answer = Math.min(answer, count.getOrDefault('l', 0));
        answer = Math.min (answer, count.getOrDefault('o', 0));
        answer = Math.min(answer, count.getOrDefault('n', 0));

        System.out.println(count);
        System.out.println(answer);
    }
}

/** Pseudocode
 * create a hashmap to hold the count of chars
 * int answer = 0;
 * char[] inputText = toCharArray;
 * char[] testWord = "balloon"; // didn't use this
 *
 * for each char in the string
 *  if the char is in the testWord // would have liked to do this but it didn't make sense
 *      add it to the map, increase if needed
 *
 *  while the chars are not zero // make sure to consider duplicate letters
 *      increment answer
 *      decrement the count of each char
 *
 *  // use Math min to find the lowest number of each letter in the testWord instead of a while loop
 *
 *  return answer
 */
