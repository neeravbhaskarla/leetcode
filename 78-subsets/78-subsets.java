class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        int subsetSize = 0;
        for(int i=0; i<nums.length; i++){
            subsetSize = subsets.size();
            for(int j = 0; j<subsetSize; j++){
                List<Integer> currentSubset = new ArrayList<>(subsets.get(j));
                currentSubset.add(nums[i]);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }
}