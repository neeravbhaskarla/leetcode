class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        int start = 0, end = 0, sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target) {
                minLength = minLength == 0 || minLength > (end - start + 1) ? (end - start + 1) : minLength;
                sum -= nums[start++];
            }
            end ++;
        }
        return minLength;
    }
}