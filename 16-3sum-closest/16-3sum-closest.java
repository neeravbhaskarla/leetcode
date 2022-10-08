class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1 && diff!=0; i++){
            int low = i+1, high = nums.length-1;
            while(low<high){
                int sum = nums[low] + nums[i] + nums[high];
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff = target-sum;
                }
                if(sum>target){
                    --high;
                }
                else{
                    ++low;
                    while(low<high && nums[low] == nums[low-1])
                        ++low;
                }
            }
        }
        return target-diff;
    }
}