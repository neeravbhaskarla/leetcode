class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<String> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        int numsLength = nums.length;
        int maxNumOfSubsets = (int) Math.pow(2, numsLength);
        
        for(int subSetIndex = 0; subSetIndex<maxNumOfSubsets; subSetIndex++){
            StringBuilder hashCode = new StringBuilder();
            List<Integer> currentSubset = new ArrayList<>();
            
            for(int iter = 0; iter<numsLength; iter++){
                int mask = 1 << iter;
                int isSubset = mask & subSetIndex;
                
                if(isSubset!=0){
                    currentSubset.add(nums[iter]);
                    hashCode.append(nums[iter]).append(',');
                }
            }
            if(!seen.contains(hashCode.toString())){
                seen.add(hashCode.toString());
                result.add(currentSubset);   
            }
        }
        
        return result;
    }
}