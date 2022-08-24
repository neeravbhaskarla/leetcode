class Solution {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++) nums[i] = nums[i] + (len*(nums[nums[i]]%len));
        for(int i=0; i<len; i++) nums[i]/=len;
        return nums;
    }
}