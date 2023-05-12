package OneToTwenty;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Expected: true, Actual: " + solution("((){})[]()()()()(){{{{}}}}"));
        System.out.println("Expected: true, Actual: " + solution("()"));
        System.out.println("Expected: true, Actual: " + solution("()[]{}"));
        System.out.println("Expected: false, Actual: " + solution("(}"));
    }

    public static boolean solution (String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (mappings.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (mappings.get(top) != s.charAt(i)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
/** Pseudocode
 *  Deque<Character> stack = new ArrayDeque<Character>();
 *  Map<Character, Character> mappings = new HashMap<>()
 *  add the parenthesis sets to the HM
 *
 *  loop the string
 *      if the char is a key
 *          push to the stack
 *      else
 *          if the stack is empty
 *              return false
 *          pop the stack
 *          if the HM.get(pop) != char
 *              return false
 * if the stack is not empty
 *  return false
 *
 * return true
 */