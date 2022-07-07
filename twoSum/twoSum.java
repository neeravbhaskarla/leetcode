class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int otherLiteral = target-nums[i];
            if(hash.containsKey(otherLiteral))
                return new int[]{hash.get(otherLiteral), i};
            hash.put(nums[i], i);
        }
        return new int[2];
    }
