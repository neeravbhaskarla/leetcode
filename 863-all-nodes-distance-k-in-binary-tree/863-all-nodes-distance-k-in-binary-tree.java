/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Map<TreeNode, TreeNode> parent = new HashMap<>();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, null);
        Set<TreeNode> seen = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(target);
        seen.add(target);
        
        int dist = 0;
        while(!queue.isEmpty()){
            
            if(dist == k) break;
            
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                if(node.left!=null && !seen.contains(node.left)){
                    queue.add(node.left);
                    seen.add(node.left);
                }
                if(node.right!=null && !seen.contains(node.right)){
                    queue.add(node.right);
                    seen.add(node.right);
                }   
                TreeNode parentNode = parent.get(node);
                if(parentNode!=null && !seen.contains(parentNode)){
                    queue.add(parentNode);
                    seen.add(parentNode);
                }
            }
            dist++;
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        while(!queue.isEmpty()){
            resultList.add(queue.remove().val);
        }
        
        return resultList;
    }
    
    private void dfs(TreeNode node, TreeNode parentNode){
        if(node == null) return;
        parent.put(node, parentNode);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}