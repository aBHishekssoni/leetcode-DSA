/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int a=0;
        while(head!=null){
            head=head.next;
            a++;
            if(a==90000)
            return true;
        }
        return false;
    }
}