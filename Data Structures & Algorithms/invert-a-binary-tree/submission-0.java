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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invertTreeLevel(root);

        return root;
        
        
        
    }
    public void invertTreeLevel(TreeNode root) {
        if (root==null) return;
        TreeNode tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;
        invertTreeLevel(root.left);
        invertTreeLevel(root.right);
    }
}
