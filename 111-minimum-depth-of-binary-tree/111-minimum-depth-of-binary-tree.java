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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return 0;
        q.add(root);
        int depth = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curNode = q.remove();
                if(curNode.left == null & curNode.right == null)
                    return depth;
                if(curNode.left != null)
                    q.add(curNode.left);
                if(curNode.right !=null)
                    q.add(curNode.right);
            }
            depth++;
        }
        return depth;
    }
}