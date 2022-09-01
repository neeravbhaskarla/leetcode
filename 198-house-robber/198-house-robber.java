class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int robNextPlusOne = 0;
        int robNext = nums[n-1];
        for(int i=n-2; i>=0; i--){
            int current = Math.max(robNext, robNextPlusOne+nums[i]);
            robNextPlusOne = robNext;
            robNext = current;
        }
        return robNext;
    }
}