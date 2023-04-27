// I love it when the solution just comes to your brain without any effort!

/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
*/

class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] answer = s.toCharArray();
        int i = 0, j = answer.length - 1;
        char tmp;

        while (i < j) {
            while (i < j && !Character.isLetter(answer[i])){
                i++;
            }
            while (i < j && !Character.isLetter(answer[j])){
                j--;
            }
            tmp = answer[i];
            answer[i++] = answer[j];
            answer[j--] = tmp;
        }
        return String.valueOf(answer);
    }
}
