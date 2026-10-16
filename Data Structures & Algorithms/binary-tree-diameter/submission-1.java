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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int hl = height(root.left);
        int hr = height(root.right);
        diameter = Math.max(diameter, hl + hr);
        return diameter;
    }

    public int height(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        int hl = height(node.left);
        int hr = height(node.right);
        diameter = Math.max(diameter, hl + hr);
        return Math.max(hl, hr) + 1;
    }

}
