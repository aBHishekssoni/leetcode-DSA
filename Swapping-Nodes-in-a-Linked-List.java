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
12    public ListNode swapNodes(ListNode head, int K) {
13        if(head==null||head.next==null) return head;
14        int c=0;
15        ListNode A = head;
16        while(A!=null){
17            c++;
18            A=A.next;
19        }
20        A = head;
21        ListNode S = new ListNode(0);
22        ListNode E = new ListNode(c);
23        int n=1;
24         while(A!=null){
25            if(n==K)
26            S.next =A;
27            if(n==c-K+1)
28            E.next =A;
29            A=A.next;
30            n++;
31        }
32        S = S.next;
33        E = E.next;
34        int t = E.val;
35        E.val = S.val;
36        S.val = t;
37        return head;
38    }
39}