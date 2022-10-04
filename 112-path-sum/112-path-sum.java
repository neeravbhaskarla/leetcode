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
    boolean found = false;
    public void dfs(TreeNode node, int currSum, int targetSum){
        if(node == null) return;
        if(node.left==null && node.right==null){
            if(currSum+node.val == targetSum){
                found = true;
                return;
            }
        }
        dfs(node.left, node.val+currSum, targetSum);
        dfs(node.right, node.val+currSum, targetSum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, 0, targetSum);
        return found;
    }
}