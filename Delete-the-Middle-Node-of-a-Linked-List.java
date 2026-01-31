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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null||head.next==null) return null;
14        ListNode dual = head;
15        ListNode single = head;
16        ListNode prev = head;
17        while(dual!=null&&dual.next!=null){
18            dual = dual.next.next;
19            prev = single;
20            single = single.next;
21        }
22        prev.next = prev.next.next;
23        return head; 
24    }
25}