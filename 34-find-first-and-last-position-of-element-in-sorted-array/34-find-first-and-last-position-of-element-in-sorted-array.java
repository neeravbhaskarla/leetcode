class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
            int iter1 = mid;
            int iter2 = mid;
            while(iter1<nums.length-1 && nums[iter1]==nums[iter1+1])
                iter1++;
            while(iter2>0 && nums[iter2]==nums[iter2-1])
                iter2--;    
                return new int[]{iter2, iter1};
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else
                left = mid+1;
        }
        return new int[]{-1, -1};
    }
}