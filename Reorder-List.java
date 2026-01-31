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
12    public void reorderList(ListNode head) {
13        ArrayList<Integer> arr = new ArrayList<>();
14        ListNode A = head;
15        while(A!=null){
16            arr.add(A.val);
17            A = A.next;
18        }
19        A =head;
20        for(int i=0;i<arr.size();i++){
21            if(A==null) break;
22          A.val = arr.get(i);
23          A= A.next;
24          if(A==null) break;
25          A.val = arr.get(arr.size()-1-i);
26          A = A.next;
27        }
28    }
29}