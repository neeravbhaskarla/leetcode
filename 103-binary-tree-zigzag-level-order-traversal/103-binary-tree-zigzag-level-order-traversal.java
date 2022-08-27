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
    List<List<Integer>> result = new ArrayList<>();
    public void levelOrderTraversal(TreeNode root, int level){
        if(root == null) return;
        if(level == result.size()) result.add(new ArrayList<>());
        if((level+1)%2==0) result.get(level).add(0, root.val);
        else result.get(level).add(root.val);
        levelOrderTraversal(root.left, level+1);
        levelOrderTraversal(root.right, level+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        levelOrderTraversal(root, 0);
        return result;
    }
}