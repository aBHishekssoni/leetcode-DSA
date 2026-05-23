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
17    public TreeNode invertTree(TreeNode root) {
18        if(root==null) return null;
19        if(root.left==null&&root.right==null) return root;
20         TreeNode temp = root;
21        if(root.left!=null&&root.right!=null){
22            temp = root.left;
23            root.left = root.right;
24            root.right = temp;
25        }
26        else if(root.right==null){
27            temp = root.left;
28            root.right = temp;
29            root.left = null;
30
31        }
32        else if(root.left==null){
33            temp = root.right;
34            root.left = temp;
35            root.right = null;
36        }
37        invertTree(root.left);
38        invertTree(root.right);
39        return root;
40    }
41}