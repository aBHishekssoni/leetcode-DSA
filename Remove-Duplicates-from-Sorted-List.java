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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null||head.next==null)
14        return head;
15        ListNode pre = head;
16        ListNode temp = head.next;
17        while(temp!=null){
18            if(pre.val==temp.val)
19           {  temp = temp.next;
20              pre.next = pre.next.next;
21            } else{
22                pre = temp;
23                temp = temp.next;
24            }
25        }
26return head;
27    }
28}