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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, -1000000000, 1000000000);
    }

    public boolean dfs(TreeNode node, int min, int max) {
        if(node==null) return true;
        if(node.val>min && node.val<max) {
            return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
        }
        return false;
    }
}
