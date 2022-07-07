class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixSum = new int[nums.length];
        int[] postfixSum = new int[nums.length];
        
        prefixSum[0]=1;
        for(int i=1; i<nums.length; i++)
            prefixSum[i]=prefixSum[i-1]*nums[i-1];
        
        postfixSum[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--)
            postfixSum[i]=postfixSum[i+1]*nums[i+1];
        
        for(int i=0; i<nums.length; i++)
            result[i]=prefixSum[i]*postfixSum[i];
        
        return result;
    }
