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
    int prefixIndex;
    Map<Integer, Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap();
        prefixIndex = 0;
        int i = 0;
        for(int num: inorder){
            inorderMap.put(num, i++);
        }
        
        return preOrderConstruct(preorder, 0, preorder.length-1);
    }
    
    private TreeNode preOrderConstruct(int[] preorder, int left, int right){
        if(left>right) return null;
        int rootVal = preorder[prefixIndex++];
        TreeNode rootNode = new TreeNode(rootVal);
        rootNode.left = preOrderConstruct(preorder, left, inorderMap.get(rootVal)-1);
        rootNode.right = preOrderConstruct(preorder, inorderMap.get(rootVal)+1, right);
        return rootNode;
    }
}