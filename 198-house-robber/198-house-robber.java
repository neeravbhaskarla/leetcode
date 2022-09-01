class Solution {
    int[] memo;
    public int rob(int i, int[] nums){
        if(i>=nums.length) return 0;
        if(i == nums.length-1) return nums[i];
        if(memo[i]!=-1) return memo[i];
        memo[i] = Math.max(rob(i+1, nums), rob(i+2, nums) + nums[i]);
        return memo[i];
    }
    public int rob(int[] nums) {
        this.memo = new int[100];
        Arrays.fill(memo, -1);
        return rob(0, nums);
    }
}