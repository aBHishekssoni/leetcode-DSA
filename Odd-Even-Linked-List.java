1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null||head.next==null) return head;
14        ListNode crr = head;
15        ListNode pre = head;
16        while(crr.next!=null&&crr.next.next!=null){
17            crr = crr.next;
18           ListNode neew = delet(crr);
19            add(pre,neew);
20            pre = pre.next;
21        }
22        return head;
23    }
24    public ListNode delet(ListNode head) {
25        ListNode del = head.next;
26        head.next = head.next.next;
27        return del;
28    }
29    public void add(ListNode head,ListNode a) {
30        a.next = head.next;
31        head.next = a;
32    }
33
34}