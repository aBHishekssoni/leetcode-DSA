public class Solution {
    public ListNode partition(ListNode A, int B) {
        if (A == null) return null;

        ListNode lessHead = new ListNode(0);   // dummy head for < B
        ListNode greaterHead = new ListNode(0); // dummy head for >= B
        ListNode less = lessHead, greater = greaterHead;

        ListNode curr = A;
        while (curr != null) {
            if (curr.val < B) {
                less.next = curr;
                less = less.next;
            } else {
                greater.next = curr;
                greater = greater.next;
            }
            curr = curr.next;
        }

        // Connect the two lists
        greater.next = null;  // important to terminate list
        less.next = greaterHead.next;

        return lessHead.next;
    }
}
