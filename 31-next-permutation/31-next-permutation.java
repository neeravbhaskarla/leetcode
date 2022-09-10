class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(i, j, nums);
        }
        reverse(i+1, nums);
    }
    public void reverse(int start, int[] nums){
        int end = nums.length-1;
        while(start<end){
            swap(start, end, nums);
            start++;
            end--;
        }
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}