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
    Map<Long, Integer> hash = new HashMap<>();
    int target;
    long currSum;
    int count = 0;
    private void traverse(TreeNode node){
        if(node == null) return;
        currSum+=node.val;
        if(currSum == target) count++;
        count+=hash.getOrDefault(currSum - target, 0);
        hash.put(currSum, hash.getOrDefault(currSum, 0)+1);
        traverse(node.left);
        traverse(node.right);
        hash.put(currSum, hash.get(currSum)-1);
        currSum-=node.val;
    }
    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        traverse(root);
        return count;
    }
}