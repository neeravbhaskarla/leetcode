class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int[] dum_nums = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(dum_nums);
        map.put(dum_nums[0], 0);
        for(int i=1; i<dum_nums.length; i++){
            if(dum_nums[i-1]==dum_nums[i]){
                map.put(dum_nums[i], count);
                continue;
            }
            count = i;
            map.put(dum_nums[i], i);
        }
        for(int i=0; i<nums.length; i++) nums[i] = map.get(nums[i]);
        return nums;
    }
}