class Solution {
    public int removeDuplicates(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        res[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                res[k++] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = res[i];
        }
        return k;
    }
}