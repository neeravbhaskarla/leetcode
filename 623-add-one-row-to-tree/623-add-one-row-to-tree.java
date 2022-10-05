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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode n = new TreeNode(val);
            n.left = root;
            return n;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        int currDepth = 1;
        while(currDepth<depth-1){
            Queue<TreeNode> temp = new ArrayDeque();
            while(!queue.isEmpty()){
                TreeNode node = queue.remove();
                if(node.left!=null) temp.add(node.left);
                if(node.right!=null) temp.add(node.right);
            }
            queue = temp;
            currDepth++;
        }
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            TreeNode temp = node.left;
            node.left = new TreeNode(val);
            node.left.left = temp;
            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
        }
        return root;
    }
}