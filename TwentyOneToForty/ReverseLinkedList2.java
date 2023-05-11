package TwentyOneToForty;
/**
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of
 * the list from position left to position right, and return the reversed list.
 *
 * Example 1:
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 *
 * Example 2:
 * Input: head = [5], left = 1, right = 1
 * Output: [5]
 *
 * Constraints:
 * The number of nodes in the list is n.
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
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
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        int currIndex = 1;
//        ListNode prevLeft = null;
//        ListNode leftNode = null;
//
//        ListNode prev = null;
//        ListNode curr = head;
//
//        if (head.next == null) {
//            return head;
//        }
//
//        while (curr != null && currIndex <= right + 1) {
//            if (currIndex < left - 1) {
//                curr = curr.next;
//                System.out.println("< left - 1: " + currIndex);
//                currIndex++;
//                continue;
//            }
//
//            if (currIndex == left - 1) {
//                prevLeft = curr;
//                curr = curr.next;
//                System.out.println("== left - 1: " + currIndex);
//                currIndex++;
//                continue;
//            }
//
//            if (currIndex == left) {
//                System.out.println("== left: " + currIndex);
//                leftNode = curr;
//            }
//
//            while (currIndex >= left && currIndex <= right) {
//                ListNode nextNode = curr.next;
//                curr.next = prev;
//                if (currIndex == right && left > 1) {
//                    prevLeft.next = curr;
//                    System.out.println("== right &&  left > 1: " + currIndex);
//                }
//                // if (currIndex == right && left <= 1) {
//                //     leftNode.next = null;
//                //     System.out.println("== right && left <= 1: " + currIndex);
//                // }
//                prev = curr;
//                curr = nextNode;
//                System.out.println("in loop: " + currIndex);
//                currIndex++;
//            }
//
//            // if (currIndex == right) {
//            //     prevLeft.next = curr;
//            //     curr = curr.next;
//            //     System.out.println("== right: " + currIndex);
//            //     currIndex++;
//            // }
//
//            if (currIndex == right + 1) {
//                leftNode.next = curr;
//                System.out.println("== right + 1: " + currIndex);
//                currIndex++;
//            }
//        }
//
//        if (left == 1 && currIndex == right + 2) {
//            head = prev;
//            System.out.println("currIndex == right + 1: " + currIndex);
//
//        }
//
//        return head;
//    }
//}

/*
currIndex = 1
prevLeft
leftNode

prev = null
curr = head

if head == null or head.next == null
    return head

loop while curr is not null && currIndex < right + 1

    if currIndex < left - 1
        curr = curr.next
        currIndex++
        continue

    if currIndex == left - 1
        prevLeft = curr
        curr = curr.next
        currIndex++
        continue

    if currIndex == left
        leftNode = curr

    loop while currIndex >= left && currIndex <= right
        ListNode nextNode = curr.next
        curr.next = prev
        prev = curr
        curr = nextNode
        currIndex++

    if currIndex == right
        prevLeft.next = curr
        curr = curr.next
        currIndex++

    if currIndex == right + 1
        curr.next = leftNode
        currIndex++


return head

*/
