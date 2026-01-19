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
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        return dfs(root,0,targetSum);
19    }
20    boolean dfs(TreeNode node,int sum, int target){
21        if(node==null) return false;
22        sum+=node.val;
23        if(node.left==null&&node.right==null){
24            return sum==target;
25        }
26        return (dfs(node.left,sum,target)
27        ||dfs(node.right,sum,target));
28    }
29}