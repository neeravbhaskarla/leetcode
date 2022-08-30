/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> hash = new HashMap();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node copy = dfs(node);
        return copy;
    }
    public Node dfs(Node node){
        if(hash.containsKey(node)){
            return hash.get(node);
        }
        hash.put(node, new Node(node.val));
        for(Node n: node.neighbors){
            hash.get(node).neighbors.add(dfs(n));
        }
        return hash.get(node);
    }
}