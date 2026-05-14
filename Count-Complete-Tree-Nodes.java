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
19        // if(TreeNode==null) return 0;
20        inOrder(root);
21        return c;
22    }
23    public void inOrder(TreeNode root) {
24    if (root == null) {
25        return;
26    }
27    c++;
28    inOrder(root.left);      // Visit left subtree
29    // System.out.print(root.val + " "); // Visit root
30    inOrder(root.right);     // Visit right subtree
31}
32}