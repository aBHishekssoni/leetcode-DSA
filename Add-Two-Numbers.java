class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = l1, prev = null;
        int carry = 0;

        // Process both lists while they exist
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            l1.val = sum % 10;
            carry = sum / 10;

            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        // If l2 is longer, attach it to l1
        if (l2 != null) {
            prev.next = l2;
            l1 = l2;  // continue processing with l2
        }

        // Process remaining nodes (either from l1 or l2)
        while (l1 != null) {
            int sum = l1.val + carry;
            l1.val = sum % 10;
            carry = sum / 10;

            prev = l1;
            l1 = l1.next;
        }

        // If carry remains, append new node
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return head;
    }
}
