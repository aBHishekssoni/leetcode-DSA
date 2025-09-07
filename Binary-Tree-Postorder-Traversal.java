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
    public List<Integer> postorderTraversal(TreeNode A) {
    ArrayList<Integer> ans = new ArrayList<>();
        traverse(A, ans);
        return ans;
    }

    private void traverse(TreeNode node, ArrayList<Integer> ans) {
        if (node == null)
            return;
        traverse(node.left, ans);
        traverse(node.right, ans);
        ans.add(node.val);
    }
}
