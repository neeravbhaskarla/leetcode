class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n<2){
            ArrayList<Integer> centroid = new ArrayList<>();
            for(int i=0; i<n; i++){
                centroid.add(i);
            }
            return centroid;
        }
        
        List<Set<Integer>> neighbours = new ArrayList<>();
        for(int i=0; i<n; i++){
            neighbours.add(new HashSet<Integer>());
        }
        for(int[] edge: edges){
            int root = edge[0], child = edge[1];
            neighbours.get(root).add(child);
            neighbours.get(child).add(root);
        }
        
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i=0; i<n; i++)
            if(neighbours.get(i).size()==1)
                leaves.add(i);
        
        int remainingNodes = n;
        while(remainingNodes > 2){
            remainingNodes-=leaves.size();
            ArrayList<Integer> newLeaves = new ArrayList();
            
            for(int leaf: leaves){
                int neighbour = neighbours.get(leaf).iterator().next();
                neighbours.get(neighbour).remove(leaf);
                
                if(neighbours.get(neighbour).size() == 1)
                    newLeaves.add(neighbour);
            }
            
            leaves = newLeaves;
        }
        
        return leaves;
    }
}