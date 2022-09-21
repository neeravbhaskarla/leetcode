class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int S = 0;
        for(int x: nums)
            if((x&1) == 0)
                S+=x;
        
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int val = queries[i][0], index = queries[i][1];
            if((nums[index]&1)==0) S-=nums[index];
            nums[index]+=val;
            if((nums[index]&1)==0) S+=nums[index];
            result[i] = S;
        }
        return result;
    }
}