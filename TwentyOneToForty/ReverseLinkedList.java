package TwentyOneToForty;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr != null) { // goes all the way to the last node
//            ListNode dummy = curr.next; // assigns the node after current to dummy
//            curr.next = prev; // reverses the pointer
//            prev = curr; // moves prev to current
//            curr = dummy; // moves curr to the dummy
//        }
//
//        return prev; // prev will be the new head because it will be holding the last value
//    }
//}

/*
prev = null
curr = head;

loop while curr is not null
    use a dummy to hold the node after current
    change curr.next to prev
    prev = curr
    curr = dummy

return prev
*/
