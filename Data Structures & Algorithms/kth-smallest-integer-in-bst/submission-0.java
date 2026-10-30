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
    int res = -1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return res;
    }

    public int dfs(TreeNode node, int k) {
        if(node==null) return 0;
        if(res!=-1) return 0;
        int count_left = dfs(node.left, k);
        if(res!=-1) return 0;
        if(count_left == k-1) {
            res = node.val;
            return 0;
        }
        int count_right = dfs(node.right, k - count_left - 1);
        if(res!=-1) return 0;
        return count_left + count_right + 1;
    }
}
