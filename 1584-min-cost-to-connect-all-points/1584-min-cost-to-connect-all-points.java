class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a, b)-> a.getKey() - b.getKey());
        
        boolean[] isMST = new boolean[n];
        
        heap.add(new Pair(0, 0));
        int minCost = 0;
        int edgesUsed = 0;
        
        while(edgesUsed < n){
            Pair<Integer, Integer> shortestNode = heap.poll();
            
            int weight = shortestNode.getKey();
            int currentValue = shortestNode.getValue();
            
            if(isMST[currentValue]){
                continue;
            }
            
            isMST[currentValue] = true;
            minCost += weight;
            edgesUsed++;
            
            for(int nextNode = 0; nextNode<n; ++nextNode){
                if(!isMST[nextNode]){
                    int nextWeight = Math.abs(points[currentValue][0] - points[nextNode][0]) +
                                          Math.abs(points[currentValue][1] - points[nextNode][1]);
                    heap.add(new Pair(nextWeight, nextNode));
                }
            }
        }
        
        return minCost;
        
    }
}