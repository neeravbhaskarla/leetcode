class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                minLen = Math.min(minLen, right+1-left);
                sum-=nums[left++];
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE?0: minLen;
    }
}