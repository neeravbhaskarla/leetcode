class Solution {
    public void moveZeroes(int[] nums) {
        int lastOnesFound = 0;
        for(int num: nums){
            if(num!=0)
                nums[lastOnesFound++] = num;
        }
        for(int i=lastOnesFound; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}