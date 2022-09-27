class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int n = nums.length;
        for(int key: map.keySet()){
            if(map.get(key)>(n/2)){
                return key;
            }
        }
        return -1;
    }
}