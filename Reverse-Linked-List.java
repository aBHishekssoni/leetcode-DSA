1// /**
2//  * Definition for singly-linked list.
3//  * public class ListNode {
4//  *     int val;
5//  *     ListNode next;
6//  *     ListNode() {}
7//  *     ListNode(int val) { this.val = val; }
8//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9//  * }
10//  */
11// class Solution {
12//     public ListNode reverseList(ListNode head) {
13//         if(head==null||head.next==null) return head;
14//         ArrayList<Integer> arr = new ArrayList<>();
15//         ListNode A = head;
16//         while(A!=null){
17//             arr.add(A.val);
18//             A = A.next;
19//         }
20//         A = head;
21//         for(int i = arr.size()-1;i>=0;i--){
22//                 A.val = arr.get(i);
23//                 A = A.next;
24//         }
25//         return head;
26//     }
27// }
28//easy solution 
29class Solution {
30    public ListNode reverseList(ListNode head) {
31        ListNode prev = null;
32        ListNode node = head;
33        while (node != null) {
34            ListNode temp = node.next;
35            node.next = prev;
36            prev = node;
37            node = temp;
38        }
39        return prev;
40    }
41}