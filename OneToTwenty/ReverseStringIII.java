package OneToTwenty;

/*
Given a string s, reverse the order of characters in each word within a sentence while
still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
 */

public class ReverseStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Why was this one so hard?")); // yhW saw siht eno os ?drah
    }

    public static String reverseWords(String s) {
        StringBuilder answer = new StringBuilder(s.length());
        int left = -1;
        int right;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                right = i - 1;
                while (right > left) {
                    answer.append(s.charAt(right));
                    right--;
                }
                answer.append(' ');
                left = i;
            }
            if (i == s.length() - 1) {
                right = i;
                while (right > left) {
                    answer.append(s.charAt(right));
                    right--;
                }
            }
        }
        return answer.toString();
    }
}
