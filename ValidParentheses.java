// My first use of the stack data structure. I love it!

package com.dancaps.leet;

import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "((){})[]()()()()(){{{{}}}}";
        char[] c = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>(); // Used as the stack data structure

        // If the array is an odd number return false
        if (c.length % 2 == 1) {
            System.out.println("false");
            System.exit(0);
        }

        for (int index = 0; index < c.length; index++) {
            // if it's an open bracket
            if (c[index] == '(' || c[index] == '[' || c[index] == '{') {
                //put it on the stack
                stack.addFirst(c[index]);
                // if it's a closing bracket
            } else if (c[index] == ')' || c[index] == ']' || c[index] == '}') {
                // if it's a closing bracket and the stack is not empty
                if (stack.isEmpty() == false) {
                    // if the top of the stack is ( && c[index] is )
                    if (stack.peekFirst() == '(' && c[index] == ')') {
                        // remove the top of the stack
                        stack.removeFirst();
                    // else if the top of the stack is [ && c[index] is ]
                    } else if (stack.peekFirst() == '[' && c[index] == ']') {
                        // remove the top of the stack
                        stack.removeFirst();
                    // else if the top of the stack is { && c[index] is }
                    } else if (stack.peekFirst() == '{' && c[index] == '}') {
                        // remove the top of the stack
                        stack.removeFirst();
                    // there is an incorrect combination therefor it's false
                    } else {
                        System.out.println("false");
                        System.exit(0);
                    }
                } else { // incorrect value
                    System.out.println("false");
                    System.exit(0);
                }
            }
        }
        // if the stack is empty and the loop is done, the world is wonderful
        if (stack.isEmpty()) {
            System.out.println("true");
            System.exit(0);
        }
        // the stack still has something in it, the world is on fire
        System.out.println("false");
        System.exit(0);
    }
}
