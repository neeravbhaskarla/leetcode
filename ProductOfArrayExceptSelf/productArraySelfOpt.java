class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int firstIter = 1; firstIter<nums.length; firstIter++)
            res[firstIter] = res[firstIter-1]*nums[firstIter-1];
        int product = 1;
        for(int secondIter = nums.length-1; secondIter>=0; secondIter--){
            res[secondIter]*=product;
            product*=nums[secondIter];
        }
        return res;
    }
