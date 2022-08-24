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
    int maxPath = Integer.MIN_VALUE;
    public int traverse(TreeNode node){
        if(node == null) return 0;
        int leftMax = Math.max(traverse(node.left), 0);
        int rightMax = Math.max(traverse(node.right), 0);
        maxPath = Math.max(maxPath, node.val+leftMax+rightMax);
        return node.val+Math.max(leftMax, rightMax);
    }
    public int maxPathSum(TreeNode root) {
       traverse(root);
        return maxPath;
    }
}