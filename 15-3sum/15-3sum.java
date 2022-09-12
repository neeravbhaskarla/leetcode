class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i] != nums[i-1])
                twoSum(result, i, nums);
        }
        return result;
    }
    public void twoSum(List<List<Integer>> result, int start, int[] nums){
        int low = start+1;
        int high = nums.length-1;
        while(low<high){
            int target = nums[low]+nums[high]+nums[start];
            if(target == 0){
                List<Integer> res = new ArrayList<>();
                res.add(nums[start]);
                res.add(nums[low++]);
                res.add(nums[high--]);
                result.add(res);
                while(low<high && nums[low] == nums[low-1]) low++;
            }
            else if(target<0){
                low++;
            }
            else{
                high--;
            }
            
        }
    }
}