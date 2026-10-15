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
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root== null) return 0;
        maxDepth(root, 1);
        return maxDepth;
    }

    public void  maxDepth(TreeNode root, int depth){
        if (root==null) return;
        maxDepth = Math.max(depth, maxDepth);
        maxDepth(root.left, depth+1);
        maxDepth(root.right,depth+1);
    }
}
