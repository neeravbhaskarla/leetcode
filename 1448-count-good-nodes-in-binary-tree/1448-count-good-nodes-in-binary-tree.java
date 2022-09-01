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
    int count = 0;
    public void traversal(TreeNode node, int max){
        if(node == null) return;
        if(node.val>=max){
            max = node.val;
            count++;
        }
        traversal(node.left, max);
        traversal(node.right, max);
    }
    public int goodNodes(TreeNode root) {
        if(root == null) return count;
        int max = root.val;
        traversal(root, max);
        return count;
    }
}