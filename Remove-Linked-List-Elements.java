1// class Solution {
2//     public ListNode removeElements(ListNode head, int val) {
3//         ListNode dummy = new ListNode(0);
4//         dummy.next = head;
5
6//         ListNode prev = dummy;
7//         ListNode curr = head;
8
9//         while (curr != null) {
10//             if (curr.val == val) {
11//                 prev.next = curr.next;   // delete
12//             } else {
13//                 prev = curr;            // move prev only if not deleted
14//             }
15//             curr = curr.next;
16//         }
17//         return dummy.next;
18//     }
19// }
20
21/**
22 * Definition for singly-linked list.
23 * public class ListNode {
24 *     int val;
25 *     ListNode next;
26 *     ListNode() {}
27 *     ListNode(int val) { this.val = val; }
28 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
29 * }
30 */
31class Solution {
32    public ListNode removeElements(ListNode head, int val) {
33        if(head==null){
34            return null;
35        }
36        head.next=removeElements(head.next,val);
37        if(head.val==val){
38            return head.next;
39        }
40        else{
41            return head;
42        }
43    }
44}