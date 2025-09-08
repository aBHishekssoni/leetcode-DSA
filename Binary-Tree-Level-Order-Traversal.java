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
    public List<List<Integer>> levelOrder(TreeNode A) {
                List<List<Integer>> ans = new ArrayList<>();
        if (A == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode x = q.poll();
                level.add(x.val);

                if (x.left != null) q.add(x.left);
                if (x.right != null) q.add(x.right);
            }

            ans.add(level);
        }

        return ans;
    }
}
// public class Solution {
//     public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//         if (A == null) return ans;

//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(A);

//         while (!q.isEmpty()) {
//             int size = q.size();
//             ArrayList<Integer> level = new ArrayList<>();

//             for (int i = 0; i < size; i++) {
//                 TreeNode x = q.poll();
//                 level.add(x.val);

//                 if (x.left != null) q.add(x.left);
//                 if (x.right != null) q.add(x.right);
//             }

//             ans.add(level);
//         }

//         return ans;
//     }
// }
