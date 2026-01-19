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
17    private int minDepth;
18
19    public int minDepth(TreeNode root) {
20        if (root == null) return 0;
21
22        minDepth = Integer.MAX_VALUE;
23        dfs(root, 0);
24
25        return minDepth;
26    }
27
28    private void dfs(TreeNode node, int curDepth) {
29        if (node == null) return;
30
31        // leaf node
32        if (node.left == null && node.right == null) {
33            minDepth = Math.min(minDepth, curDepth + 1);
34            return;
35        }
36
37        dfs(node.left, curDepth + 1);
38        dfs(node.right, curDepth + 1);
39    }
40}