class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minimum = new int[cost.length+1];
        minimum[0] = 0;
        minimum[1] = 0;
        for(int i=2; i<minimum.length; i++){
            minimum[i] = Math.min(minimum[i-1]+cost[i-1], minimum[i-2]+cost[i-2]);
        }
        return minimum[cost.length];
    }
}






