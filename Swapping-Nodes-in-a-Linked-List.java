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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode slow =head;
14        ListNode fast=head;
15        for(int i =1;i<=k;i++){
16            fast=fast.next;
17        }
18
19        while(fast!=null){
20            slow = slow.next;
21            fast=fast.next;
22
23        }
24        fast=head;
25       for(int i =1;i<=k-1;i++){
26            fast=fast.next;
27        }
28
29        int temp = fast.val;
30        fast.val =slow.val;
31        slow.val=temp;
32        return head;
33     // My meathod
34        // if(head==null||head.next==null) return head;
35        // int c=0;
36        // ListNode A = head;
37        // while(A!=null){
38        //     c++;
39        //     A=A.next;
40        // }
41        // A = head;
42        // ListNode S = new ListNode(0);
43        // ListNode E = new ListNode(c);
44        // int n=1;
45        //  while(A!=null){
46        //     if(n==k)
47        //     S.next =A;
48        //     if(n==c-k+1)
49        //     E.next =A;
50        //     A=A.next;
51        //     n++;
52        // }
53        // S = S.next;
54        // E = E.next;
55        // int t = E.val;
56        // E.val = S.val;
57        // S.val = t;
58        // return head;
59    }
60}