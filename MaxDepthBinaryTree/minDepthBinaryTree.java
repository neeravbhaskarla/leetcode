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
    public int maxDepth(TreeNode root, int length){
        if(root==null) return length;
        return Math.max(maxDepth(root.left, length+1), maxDepth(root.right, length+1));
    }
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
