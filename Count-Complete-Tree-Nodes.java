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
17    int c = 0;
18    public int countNodes(TreeNode root) {
19        inOrder(root);
20        return c;
21    }
22    public void inOrder(TreeNode root) {
23    if (root == null) {
24        return;
25    }
26    c++;
27    inOrder(root.left);
28    inOrder(root.right);
29}
30}