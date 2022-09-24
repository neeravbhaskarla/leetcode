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
    int maxSum = Integer.MIN_VALUE;
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();
        dfs(root, 0, targetSum, new ArrayList<Integer>());
        return result;
    }
    public void dfs(TreeNode node, int sum, int targetSum, List<Integer> arr){
        if(node == null)
            return;
        arr.add(node.val);
        if((node.val + sum) == targetSum && node.left==null && node.right==null){
            result.add(new ArrayList<Integer>(arr));
        }
        dfs(node.left, sum+node.val, targetSum, arr);
        dfs(node.right, sum+node.val, targetSum, arr);
        arr.remove(arr.size()-1);
    }
}