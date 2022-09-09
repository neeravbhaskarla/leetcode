class Solution {
    public boolean canJump(int[] nums) {
        int finalJump = nums.length-1;
        for(int i = nums.length-1; i>=0; i--)
            if(i+nums[i]>=finalJump)
                finalJump = i;
        return finalJump == 0;
    }
}