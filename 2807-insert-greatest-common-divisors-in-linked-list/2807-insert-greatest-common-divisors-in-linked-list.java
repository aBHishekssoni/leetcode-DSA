/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode A = head;
        while(A.next!=null){
            insert(A,gcd(A.val,A.next.val));
            A = A.next.next;
        }
        return head;
    }

     int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
    
    ListNode insert(ListNode head,int data){
        if(head.next==null||head==null) return head;
        ListNode temp = head.next;
        ListNode a = new ListNode();
        a.val = data;
        head.next = a;
        a.next = temp;
        return head;
    }
}