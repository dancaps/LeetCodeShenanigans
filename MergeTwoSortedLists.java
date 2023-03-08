// I had to look up the answer because I was struggling to understand this one. I need more practice with linked lists.

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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(); // Creates a new head list node to initalize the list
        ListNode tmp = head; // Create a tmp reference to the head node

        // While both lists have a next node
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) { // If the val of node1 is <= the val of node2
                tmp.next = list1; // Assign node1 as the next node in the new list
                list1 = list1.next; // Update list1 to be the next node
            } else {
                tmp.next = list2; // Assign node 2 as the next node in the new list
                list2 = list2.next; // Update list2 to be the next node
            }
            tmp = tmp.next; // Move down the new list so that another node can be added to the end
        }

        if (list1 != null) { // If list1 is not empty
            tmp.next = list1; // add list1 to the end of the new list
        } else {
            tmp.next = list2; // add list2 to the end of the new list
        }

        return head.next; // Returns the second node because that is the true start of the new list
    }
}
