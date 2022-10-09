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
    public boolean dfs(TreeNode node, Set<Integer> set, int target){
        if(node == null) return false;
        if(set.contains(target - node.val)) return true;
        set.add(node.val);
        return dfs(node.left, set, target) || dfs(node.right, set, target);
    }
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, new HashSet<Integer>(), k);
    }
}