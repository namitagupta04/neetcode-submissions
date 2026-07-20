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

        // Create a dummy node
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        // Keep a pointer to the start of the merged list
        ListNode headNode = returnNode;

        // Traverse both lists
        while (list1 != null && list2 != null) {

            // Compare values
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;
            }

            // Move the pointer forward
            returnNode = returnNode.next;
        }

        // Attach the remaining nodes
        if (list1 == null) {
            returnNode.next = list2;
        } else {
            returnNode.next = list1;
        }

        // Return the merged list (skip dummy node)
        return headNode.next;
    }
}