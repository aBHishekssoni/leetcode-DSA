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
    public List<Integer> rightSideView(TreeNode A) {
        List<Integer> ans = new ArrayList<>();
        if (A == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        TreeNode d = null;
        q.add(null);
        while(q.size()>1){
            TreeNode x = q.poll();
            if(x==null){
                ans.add(d.val);
                q.add(null);
            }else{
            if(x.left!=null){q.add(x.left);}
            if(x.right!=null){q.add(x.right);}
                 d=x;}
        }
          ans.add(d.val);
        return ans;
    }
}
