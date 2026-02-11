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
12    public boolean isPalindrome(ListNode head) {
13        if(head==null||head.next==null) return true;
14        StringBuilder sb = new StringBuilder();
15        ListNode a = head;
16        while(a!=null){
17            sb.append(a.val);
18            a = a.next;
19        }
20        String s =sb.toString();
21        sb.reverse();
22        if(s.equals(sb.toString())) return true;
23        return false;
24
25    }
26}