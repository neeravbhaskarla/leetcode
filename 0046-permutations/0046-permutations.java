class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> lis , int[] nums){
        if(lis.size() == nums.length){
            result.add(new ArrayList<Integer>(lis));
        }
        for(int i=0; i<nums.length; i++){
            if(!lis.contains(nums[i])){
                lis.add(nums[i]);
                backtrack(result, lis, nums);
                lis.remove(lis.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<Integer>(), nums);
        return result;
    }
}