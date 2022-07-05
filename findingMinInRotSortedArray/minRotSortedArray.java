class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int res = nums[0];
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[start]<nums[end]) return Math.min(res, nums[start]);
            res = Math.min(nums[mid], res);
            if(nums[mid]>=nums[end]) start=mid+1;
            else end = mid-1;
        }
        return res;
    }
