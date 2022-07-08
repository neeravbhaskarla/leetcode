class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                twoSum(i, nums, res);
            }
        }
        return res;
    }
    public void twoSum(int start, int[] nums, List<List<Integer>> res){
        int low = start+1;
        int high = nums.length-1;
        while(low<high){
            int sum = nums[start] + nums[low] + nums[high];
            if(sum>0){
                high--;
            }
            else if(sum<0){
                low++;
            }
            else{
                res.add(Arrays.asList(nums[start], nums[low++], nums[high--]));
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
            }
        }
    }
