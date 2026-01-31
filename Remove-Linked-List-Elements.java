1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7        ListNode curr = head;
8
9        while (curr != null) {
10            if (curr.val == val) {
11                prev.next = curr.next;   // delete
12            } else {
13                prev = curr;            // move prev only if not deleted
14            }
15            curr = curr.next;
16        }
17        return dummy.next;
18    }
19}
20