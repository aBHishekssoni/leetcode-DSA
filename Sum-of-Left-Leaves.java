1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    boolean found = false;
18    public int sumOfLeftLeaves(TreeNode root) {
19         if(root==null){
20            return 0;
21
22        }
23       
24        if(root.left==null && root.right==null && found){
25           return root.val;
26         
27        }
28        found = true;
29       int l= sumOfLeftLeaves(root.left);
30       found = false;
31       int r= sumOfLeftLeaves(root.right);
32        return l+r;
33    }
34}