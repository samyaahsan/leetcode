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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curSum = 0;
        return(dfs(root, targetSum, curSum));
    }
    
    public boolean dfs(TreeNode node, int targetSum, int curSum){
        if (node == null)
            return false;
        curSum += node.val;
        
        if(node.left == null && node.right == null)
            return (curSum == targetSum);
        
        return (dfs(node.left, targetSum, curSum) || dfs(node.right, targetSum, curSum));
    }
}