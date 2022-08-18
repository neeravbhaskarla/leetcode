class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum<k){
                left++;
                result = Math.max(result, sum);
            }
            else{
                right--;
            }
        }
        return result;
    }
}