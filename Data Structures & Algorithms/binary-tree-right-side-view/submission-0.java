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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q1 = new ArrayDeque<TreeNode>();
        Queue<TreeNode> q2 = new ArrayDeque<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        q1.offer(root);
        Queue<TreeNode> from = q1;
        Queue<TreeNode> to = q2;
        TreeNode top;
        while(!from.isEmpty()) {
            top = from.poll();
            res.add(top.val);
            if(top.right!=null) to.offer(top.right);
            if(top.left!=null) to.offer(top.left);
            while(!from.isEmpty()) {
                top = from.poll();
                if(top.right!=null) to.offer(top.right);
                if(top.left!=null) to.offer(top.left);
            }
            Queue<TreeNode> temp = from;
            from = to;
            to = temp;
        }
        return res;
    }
}
