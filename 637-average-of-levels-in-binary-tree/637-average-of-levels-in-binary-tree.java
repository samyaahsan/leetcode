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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgs = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return avgs;
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0.0;
            for (int i = 0; i < size; i++){
                TreeNode curNode = q.remove();
                sum += curNode.val;
                if(curNode.left != null){
                    q.add(curNode.left);
                    
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                    
                }
            }
            System.out.println("sum: " + sum);
            avgs.add(sum/size);    
            
        }
        
        return avgs;
    }
}