class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, n = nums[0];
        
        for(int num : nums){
            
            count += (n == num) ? 1 : -1;
            
            if(count == 0){
                n = num;
                count = 1;
            }
        }
        
        
        return n;
    }
}