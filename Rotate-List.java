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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null||head.next==null) return head;
14        ListNode pre = head;
15        int n=0;
16        while(pre!=null){
17            n++;
18            pre = pre.next;
19        }
20        if(k%n==0) return head;
21        k = k%n;
22        ListNode crr = head.next;
23        pre = head;
24        for(int i=1;i<n-k;i++){
25            pre = pre.next;
26            crr = crr.next;
27        }
28        pre.next = null;
29        ListNode ans = crr;
30        while(crr.next!=null)
31        crr = crr.next;
32        crr.next = head;
33        return ans;
34    }
35}