/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean found = false;
    public int sumOfLeftLeaves(TreeNode root) {
         if(root==null){
            return 0;

        }
       
        if(root.left==null && root.right==null && found){
           return root.val;
         
        }
        found = true;
       int l= sumOfLeftLeaves(root.left);
       found = false;
       int r= sumOfLeftLeaves(root.right);
        return l+r;
    }
}