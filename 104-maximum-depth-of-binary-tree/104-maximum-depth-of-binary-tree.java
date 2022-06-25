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
    public int maxDepth(TreeNode root) {
        // base case
        // the root we are at is null, so its depth is 0
        if(root == null) {
            return 0;
        }
        
        // recursive case
        // we are at a non null node so return 1 (for our current node)
        // + max of the left subtree depth and the right subtree depth
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
        //return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
}