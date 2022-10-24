class Solution {
    public void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        for(int lastFoundZero = 0, curr = 0; curr<nums.length; curr++){
            if(nums[curr]!=0){
                swap(nums, lastFoundZero++, curr);
            }
        }
    }
}