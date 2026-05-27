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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13        if(head==null||head.next==null) return head;
14        ListNode A = head;
15        while(A.next!=null){
16            insert(A,gcd(A.val,A.next.val));
17            A = A.next.next;
18        }
19        return head;
20    }
21
22     int gcd(int a, int b) {
23    if (b == 0) return a;
24    return gcd(b, a % b);
25}
26    
27    ListNode insert(ListNode head,int data){
28        if(head.next==null||head==null) return head;
29        ListNode temp = head.next;
30        ListNode a = new ListNode();
31        a.val = data;
32        head.next = a;
33        a.next = temp;
34        return head;
35    }
36}