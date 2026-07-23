class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // Step 2: Reverse second half using head insertion
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;

        while (preCurrent.next != null) {

            ListNode current = preCurrent.next;

            preCurrent.next = current.next;

            current.next = preMiddle.next;

            preMiddle.next = current;
        }

        // Step 3: Merge two halves
        p1 = head;
        p2 = preMiddle.next;

        while (p1 != preMiddle) {

            preMiddle.next = p2.next;

            p2.next = p1.next;

            p1.next = p2;

            p1 = p2.next;

            p2 = preMiddle.next;
        }
    }
}