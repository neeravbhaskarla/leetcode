class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        while(right<nums.length){
            if(nums[left]!=nums[right] && left<nums.length){
                int temp = nums[++left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            right++;
        }
        return left+1;
    }
}