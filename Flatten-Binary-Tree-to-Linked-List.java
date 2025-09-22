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
    public void flatten(TreeNode a) {
         if(a==null) return;
        TreeNode cr =a;
         while (cr != null) {
            if (cr.left != null) {
                TreeNode temp = cr.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = cr.right;
                cr.right = cr.left;
                cr.left = null;
            }
            cr = cr.right;
        }
        return;
    }
}
