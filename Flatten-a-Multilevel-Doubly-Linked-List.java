1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if( head == null) return head;
14        Node p = head; 
15        while( p!= null) {
16            if( p.child == null ) {
17                p = p.next;
18                continue;
19            }
20            Node temp = p.child;
21            while( temp.next != null ) 
22                temp = temp.next;
23            temp.next = p.next;  
24            if( p.next != null )  p.next.prev = temp;
25            p.next = p.child; 
26            p.child.prev = p;
27            p.child = null;
28        }
29        return head;
30    }
31}