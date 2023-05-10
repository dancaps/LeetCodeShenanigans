//package TwentyOneToForty;
/**
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
 * Node.val == val, and return the new head.
 *
 * Example 1:
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Example 2:
 * Input: head = [], val = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 *
 * Constraints:
 * The number of nodes in the list is in the range [0, 104].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
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
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode curr = head;
//
//        while (curr != null) { // break loop if it's empty - Handles the first node
//            if (curr.val == val && curr == head) { // if the first node is the val
//                head = head.next; // move the head to the next one
//                curr = head; // reset curr to head
//                continue;
//            }
//
//            if (curr.next == null) { // if this is the last one - Handles the last node
//                break;
//            }
//
//            if (curr.next.val == val) { // if the value of the next node equals val - Handles the node equaling val
//                curr.next = curr.next.next; // assign the current node next to node of next. Skips the next one. Confusing as hell.
//                continue;
//            }
//
//            curr = curr.next; // The node doesn't equal value and it's not the first or last
//        }
//
//        return head;
//    }
//}
