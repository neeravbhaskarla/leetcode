class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
            map.put(i, Integer.MAX_VALUE);
        
        map.put(src, 0);
        for(int i=0; i<k+1; i++){
            Map<Integer, Integer> tempMap = new HashMap(map);
            for(int[] flight: flights){
                int s = flight[0];
                int d = flight[1];
                int p = flight[2];
                
                if(map.get(s) == Integer.MAX_VALUE) continue;
                if(map.get(s)+p < tempMap.get(d)) tempMap.put(d, map.get(s)+p);
            }
            map = new HashMap(tempMap);
        }
        int result = -1;
        if(map.get(dst) != Integer.MAX_VALUE) result = map.get(dst);
        return result;
    }
}