class Solution {
    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int left = 0;
        while(left<nums.length-1){
            if(nums[left] == 0){
                int right = left+1;
                while(right<nums.length && nums[right]==0) right++;
                if(right<nums.length) swap(nums, left, right);
            }
            left++;
        }
    }
}