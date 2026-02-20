1class Solution {
2
3    // Reverse function
4    private ListNode reverse(ListNode head) {
5        ListNode prev = null;
6        while (head != null) {
7            ListNode next = head.next;
8            head.next = prev;
9            prev = head;
10            head = next;
11        }
12        return prev;
13    }
14
15    public ListNode removeNodes(ListNode head) {
16
17        // Step 1: Reverse the list
18        head = reverse(head);
19
20        int max = head.val;
21        ListNode curr = head;
22
23        // Step 2: Remove nodes smaller than max
24        while (curr != null && curr.next != null) {
25            if (curr.next.val < max) {
26                curr.next = curr.next.next;   // delete
27            } else {
28                curr = curr.next;
29                max = curr.val;              // update max
30            }
31        }
32
33        // Step 3: Reverse again
34        return reverse(head);
35    }
36}