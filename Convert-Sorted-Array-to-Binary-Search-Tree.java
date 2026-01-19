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
17    public TreeNode sortedArrayToBST(int[] nums) {
18  
19        return help(nums,0,nums.length-1);
20    }   
21       TreeNode help(int[] nums,int l,int r){
22            if(l>r)
23            return null;
24            int m = (l+r)/2;
25            TreeNode root = new TreeNode(nums[m]);
26            root.right = help(nums,m+1,r);
27            root.left = help(nums,l,m-1);
28            return root;
29        }
30}