/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result;
    public void dfs(Node node, int level){
        if(node==null) return;
        if(result.size()<level+1)
            result.add(new ArrayList<>());
        result.get(level).add(node.val);
        if(node.children.size()!=0){
            for(Node child: node.children){
                dfs(child, level+1);
            }
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        result = new ArrayList<>();
        dfs(root, 0);
        return result;
    }
}