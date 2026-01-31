1class Solution {
2    public ListNode modifiedList(int[] nums, ListNode head) {
3        if (head == null) return null;
4
5        // Store nums in HashSet for O(1) lookup
6        HashSet<Integer> set = new HashSet<>();
7        for (int x : nums) {
8            set.add(x);
9        }
10
11        ListNode dummy = new ListNode(0);
12        dummy.next = head;
13
14        ListNode prev = dummy;
15        ListNode curr = head;
16
17        while (curr != null) {
18            if (set.contains(curr.val)) {
19                prev.next = curr.next; // delete node
20            } else {
21                prev = curr;          // move prev only if not deleted
22            }
23            curr = curr.next;
24        }
25
26        return dummy.next;
27    }
28}
29