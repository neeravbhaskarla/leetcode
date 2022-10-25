class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while(right<nums.length){
            if(nums[left]!=nums[right] && left<nums.length){
                swap(nums, ++left, right);
            }
            right++;
        }
        return left+1;
    }
}