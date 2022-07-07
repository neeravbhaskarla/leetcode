class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> unique = new HashMap<>();
        for(int num: nums) unique.put(num, unique.getOrDefault(num, 0)+1);
        Queue<Integer> prorityQueue = new PriorityQueue((a,b)->unique.get(a)-unique.get(b));
        for(int val: unique.keySet()){
            prorityQueue.add(val);
            if(prorityQueue.size()>k) prorityQueue.poll();   
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = prorityQueue.poll();
        }
        return res;
    }
