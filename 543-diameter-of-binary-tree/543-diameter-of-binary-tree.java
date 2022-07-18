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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    
    public int dfs(TreeNode node){
        if (node == null)
            return 0;
        
        int lh = dfs(node.left);
        int rh = dfs(node.right);
        
        max = Math.max(max, lh + rh);
        return Math.max(lh, rh) + 1;
    }
}