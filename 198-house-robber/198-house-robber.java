class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] result = new int[n+1];
        result[n] = 0;
        result[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--) 
            result[i] = Math.max(result[i+1], result[i+2]+nums[i]);
        return result[0];
    }
}