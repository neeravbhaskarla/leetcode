class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int prev = lower-1;
        for(int i = 0; i<nums.length; i++){
            if(prev+1<=nums[i]-1){
                result.add(returnRange(prev+1, nums[i]-1));
            }
            prev = nums[i];
        } 
        upper = upper+1;
        if(prev+1<=upper-1){
            result.add(returnRange(prev+1, upper-1));
        }
        return result;
    }
    public String returnRange(int lower, int upper){
        if(lower == upper) return String.valueOf(lower);
        else{
            return lower+"->"+upper;
        }
    }
}