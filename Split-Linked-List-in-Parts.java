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
12    public ListNode[] splitListToParts(ListNode head, int k) {
13        ListNode pre = head;
14        int n=0;
15        while(pre!=null){
16        pre = pre.next;
17        n++;
18        }
19        pre = head;
20        if(k>=n){
21            ListNode[] ans = new ListNode[k];
22            int i=0;
23            while(pre!=null){
24                ListNode temp= new ListNode();
25                temp .val = pre.val;
26                ans[i] = temp;
27                pre = pre.next;
28                i++;
29            }
30            return ans;
31        }else{
32    pre = head;
33    ListNode[] ans = new ListNode[k];
34
35    int mod = n % k;
36    int j = 0, a = 1;
37
38    while(pre != null && j < k){
39
40        ListNode temp = new ListNode();
41        ListNode next = temp;
42
43        int size = n / k + a;
44
45        if(mod <= 0){
46            size = n / k;
47        }
48
49        for(int i = 0; i < size && pre != null; i++){
50
51            ListNode t = new ListNode();
52            t.val = pre.val;
53
54            next.next = t;
55            next = t;      // pointer move
56
57            pre = pre.next;
58        }
59
60        ans[j] = temp.next;   // dummy skip
61        j++;
62
63        mod--;
64        if(mod == 0) a = 0;
65    }
66
67    return ans;
68}
69
70    }
71}