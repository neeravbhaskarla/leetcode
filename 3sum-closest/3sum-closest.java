class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int index = 0; index<nums.length && diff!=0; index++){
            int left = index+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[index]+nums[left]+nums[right];
                if(Math.abs(target - sum)<Math.abs(diff)){
                    diff = target-sum;
                }
                if(sum>target){
                    right--;
                }
                else{
                    left++;
                    while(left<right && nums[left-1]==nums[left])left++;
                }
            }
        }
        return target - diff;
    }
}